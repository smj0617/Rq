package com.back;

import java.util.Scanner;

public class App {
    private Scanner sc= new Scanner(System.in);

    public void run(){
        System.out.println("== 명언 앱 ==");
        while(true){
            System.out.print("명령) ");
            String order = sc.nextLine().trim();
            if(order.equals("종료"))break;
            else if(order.equals("등록")){

            }
        }
    }
}
