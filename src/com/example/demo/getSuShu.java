package com.example.demo;

public class getSuShu {
    public static void main(String args[]){
        int count=0;
        for(int i=100;i<200;i++){
            boolean flag = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("所包含的素数为："+count);
    }
}
