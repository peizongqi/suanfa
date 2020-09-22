package com.example.demo;

/**
 * 水仙花算法
 */
 public class shuixianhua {
    public static void main(String args[]){
        for(int i=100;i<1001;i++){
            int a = i%10;
            int b = i/10%10;
            int c = i/100;
            if(a*a*a+b*b*b+c*c*c == i){
                System.out.println(i);
            }
        }
    }
}
