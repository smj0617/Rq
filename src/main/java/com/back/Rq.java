package com.back;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private Map<String,String> value= new HashMap<>();
    private String actionName;
    public Rq(String word){
        String[] temps=word.split("\\?",2);
        if(temps.length !=2 || temps[1].isBlank()){
            System.out.println("id를 입력해주시오.");
            return;
        }
        actionName=temps[0];
    }
    public String getActionName(){
        return actionName;
    }
    public int getParamAsInt(String id,int defaultVlaue){
        return -1;
    }

    public String getParam(String 이름, String s) {
        return "홍길동";
    }

}

