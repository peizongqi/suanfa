package com.example.demo;

import java.util.Scanner;

/**
 * 水仙花算法
 */
 public class shuixianhua {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            if (m >= 100 && m <= n && n <= 999) {
                for (int i = m; i < n; i++) {
                    int a = i % 10;
                    int b = i / 10 % 10;
                    int c = i / 100;
                    if (a * a * a + b * b * b + c * c * c == i) {
                        System.out.print(i + " ");
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("no");
                }
                System.out.println();
            } else {
                System.out.println("no");
            }
        }
    }
}
