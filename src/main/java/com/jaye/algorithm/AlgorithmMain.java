package com.jaye.algorithm;

import com.jaye.algorithm.sort.BubbleSort;
import com.jaye.algorithm.sort.QuickSort;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-13 14:18
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class AlgorithmMain {
    static int[] array = {22,5,7,2,1,7,9,5,8,4,35,72,11,62,43};
    public static void main(String[] args) {
        QuickSort.sort(array);
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
