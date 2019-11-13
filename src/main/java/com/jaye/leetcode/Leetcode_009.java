package com.jaye.leetcode;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2019-03-05 14:13
 * Email: gaoweivf@aliyun.com
 * Description:
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

     示例 1:

     输入: 121
     输出: true
     示例 2:

     输入: -121
     输出: false
     解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
     示例 3:

     输入: 10
     输出: false
     解释: 从右向左读, 为 01 。因此它不是一个回文数。
     进阶:

     你能不将整数转为字符串来解决这个问题吗？
 **/

public class Leetcode_009 {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE-1);
        System.out.println(Leetcode_009.isPalindrome(Integer.MAX_VALUE));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){return false;}
        int source = x;
        int target = 0;
        do{
            target = target*10+x%10;
            x = x/10;
        }while(x!=0);
        System.out.println(target);
        if(target==source){return true;}
        return false;
    }
}
