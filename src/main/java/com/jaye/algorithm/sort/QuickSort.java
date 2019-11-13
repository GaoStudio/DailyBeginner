package com.jaye.algorithm.sort;

/**
 * Program: 快速排序
 * Author: Gaowei
 * Date: 2018-12-13 14:02
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class QuickSort {
    public static int[] sort(int[] array){
        quickSort(array,0,array.length-1,"main");
        return array;
    }
    private static void quickSort(int[] array, int left, int right,String dr){
        System.out.println(dr+":::"+left+":::"+right);
        if(left>=right) return;
        int low = left;
        int height = right;
        int Pivot = array[left];
        while (low<height){
            while (low<height&&array[height]>=Pivot){
                height--;
            }
            if(height>low){
                array[low] = array[height];
            }
            while (low<height&&array[low]<=Pivot){
                low++;
            }
            if(height>low){
                array[height] = array[low];
            }
        }
        array[low] = Pivot;
        if(left<low){
            quickSort(array,left,low-1,"left");
        }
        if(low<right){
            quickSort(array,low+1,right,"right");
        }
    }
}
