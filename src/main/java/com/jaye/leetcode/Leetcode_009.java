package com.jaye.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

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
        //System.out.println(Integer.MIN_VALUE-1);
        //char re = new char[["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
        int array[] = new int[5];
        array[0] =2;
        array[1] =3;
        array[2] =1;
        array[3] =1;
        array[4] =4;
        //System.out.println(jump(array));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean in[] = new boolean[strs.length];
        for(int i =0 ;i<strs.length;i++){

            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);

            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length()==strs[j].length()){
                    for(int k=0;k<strs[i].length();k++){
                        if(strs[j].indexOf(strs[i].substring(k,k+1))==-1){break;}
                        if(k==strs[i].length()-1){
                            temp.add(strs[j]);
                        }
                    }
                }
            }
            result.add(temp);
        }
        return  result;
    }
    public static int trap(int[] height) {
        int i = 0;
        int sum = 0 ;
        while(i<height.length-1){
            int start = height[i];
            int temp = 0;
            for(int j = i+1;j<height.length;j++){
                if(height[j]>=start){
                    i = j;
                    sum = sum + temp;
                    break;
                }else{
                    temp = temp+start-height[j];
                }
                if(j==height.length-1){
                    i++;
                }
            }
        }
        return sum;
    }
    public boolean isValidSudoku(char[][] board) {
        int row[][] = new int[9][9];
        int column[][] = new int[9][9];
        for(int i = 0; i<9;i++){
            int rowStart = i%3*3;
            int columnStart = i/3*3;
            int judge[] =new  int[9];
            for(int j = 0;j<3;j++){
                for(int k = 0;k<3;k++){
                    int num = (int)board[rowStart+j][columnStart+k];
                    if(judge[num]==1||row[rowStart+j][num]==1||column[columnStart+k][num]==1){
                        return false;
                    }else{
                        judge[num] =1;
                        row[rowStart+j][num]=1;
                        column[columnStart+k][num]=1;
                    }
                }
            }
        }
        return true;
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
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int pre = -1;
        for(int i = 0;i<s.length();i++){
            if(s.substring(i,i+1).equals("(")){
                stack.push(i);
            }else if(s.substring(i,i+1).equals(")")){
                if(!stack.empty()){
                    int j = stack.pop();
                    int cur = i - pre;
                    if(!stack.empty()){
                        cur = i-stack.peek();
                    }
                    if(cur>max){
                        max = cur;
                    }
                }else{
                    pre = i;
                }
            }
        }
        return max;
    }
    public static int romanToInt(String s) {
        String marks[] = {"M","D","C","L","X","V","I"};
        int values[] = {1000,500,100,50,10,5,1};
        int index = 0;
        int sum = 0;
        for(int i = 0;i<marks.length;i++){
            while(index<s.length()&&marks[i].equals(s.substring(index,index+1))){
                sum+=values[i];
                index++;
            }
            if(index<s.length()-1){
                if(s.substring(index+1,index+2).equals(marks[i])){
                    sum+=values[i];
                    if(s.substring(index,index+1).equals(marks[i+1])){
                        sum-=values[i+1];
                    }else{
                        sum-=values[i+2];
                    }
                    index+=2;
                }
            }
        }
        return sum;
    }
}
