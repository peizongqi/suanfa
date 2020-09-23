package com.example.demo;

import java.util.Scanner;

/**
 * 求数列和
 */
public class sumShuLie {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double n = sc.nextInt();
            int m = sc.nextInt();
            if(n<10000&&m<1000){
                double sum = 0;
                for(int i=0;i<m;i++){
                    sum+= n;
                    n = Math.sqrt(n);
                }
                System.out.printf("%.2f",sum);
                System.out.println();
            }
        }
    }
}
