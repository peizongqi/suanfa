package com.example.demo;

/**
 * 查询子串在字符串中出现的次数
 */
public class countChildStr {
    public static void main(String args[]){
        String str = "abbbcabacbabccswascabssabcaba";
        String childStr = "ab";
        int count = 0;
        int i = 0;
        while (str.indexOf(childStr,i)!=-1){
            count++;
            i = str.indexOf(childStr,i)+childStr.length();
        }
        System.out.println("子串 "+childStr+" 出现次数为:"+count);
    }
}
