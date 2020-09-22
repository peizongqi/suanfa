package com.example.demo;

import java.util.Scanner;

/**
 * 输入日期，返回该日期是当年的第几天
 */
public class todayIsWhichDay {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int count = 0;
        int days = 0;
        if(year>0&&month>0&&day>0&&month<13&&day<32){
            for(int i =1;i<month;i++){
                switch (i){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 2:
                        if((year%100 !=0 && year%4 ==0)||year%400 ==0){
                            days = 29;
                        }else {
                            days = 28;
                        }
                        break;
                }
                count+=days;
            }
            count = count+day;
            System.out.println(year+"-"+month+"-"+day+" 是当年的第"+count+"天");
        }else {
            System.out.println("输入数据有误！");
        }
    }
}
