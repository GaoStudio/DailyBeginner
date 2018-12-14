package com.jaye.algorithm.sort;

/**
 * Program: 冒泡排序
 * Author: Gaowei
 * Date: 2018-12-13 14:05
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class BubbleSort {
    public static int[] sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
