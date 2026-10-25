package com.back;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Rq {
    private final String cmd;
    private final Map<String,String> value;
    public Rq(String s) {
        this.cmd=s;
        String[] temps= cmd.split("\\?",2);
        String temp = temps.length == 2 ? temps[1] : "";
        value = Arrays
                .stream(temp.split("&"))
                .map(e->e.split("=",2))
                .filter(e->e.length == 2 && !e[0].isBlank() && !e[1].isBlank())
                .collect(Collectors.toMap(e->e[0],e->e[1]));

    }

    public String getActionName() {

        return cmd.split("\\?",2)[0];
    }

    public String getParam(String 이름, String s) {

        return value.getOrDefault(이름,s);
    }

    public int getParamAsInt(String page, int i) {
        String value =getParam(page,"");
        if(value.isBlank()) return i;
        try{
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return i;
        }

    }
}
