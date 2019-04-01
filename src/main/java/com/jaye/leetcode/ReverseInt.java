package com.jaye.leetcode;

import java.util.Arrays;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-17 15:12
 * Email: gaoweivf@aliyun.com
 * Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *  示例 1:
 *
 *      输入: 123
 *      输出: 321
 *  示例 2:
 *
 *      输入: -123
 *      输出: -321
 **/

public class ReverseInt {
    public static void main(String[] args) {
       System.out.print( ReverseIntString(2147483647));
       // System.out.print( ReverseIntString(9646324351));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.reverse();
    }
    //第一种：转换为字符串操作
    /**
     *  问题：
     *  1.无法判断反转后的字符串是否超过最大值最小值（捕获异常）
     *
     */
    public static int ReverseIntString(int x){
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
            return 0;
        }
        String intInput = String.valueOf(Math.abs(x));
        int intLength = intInput.length();
        char temp[] = new char[intLength];
        for (int i=0;i<=intLength/2;i++){
            temp[intLength-i-1] = intInput.charAt(i);
            temp[i] = intInput.charAt(intLength-i-1);
        }
        String intResult = new String(temp);
        try{
           return x>0?Integer.parseInt(intResult):Integer.parseInt("-"+intResult);
        }catch (Exception e){
            return 0;
        }
    }

    /**
     *  移位转换
     * @param x
     * @return
     */
    public static int ReverseIntSolution(int x){
        int result = 0 ;
        while (x!=0){
            //取x的最后一位
            int pop = x%10;
            //移除最后一位
            x = x/10;
            //判断超过最大
            if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&pop>7)){
                return 0;
            }
            //超过最小
            if(result<Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE/10&&pop<-8)){
                return 0;
            }
            result = result*10+pop;

        }
        return  result;
    }
}
