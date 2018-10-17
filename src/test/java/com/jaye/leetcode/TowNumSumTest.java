package com.jaye.leetcode;

import org.junit.Test;

public class TowNumSumTest {

    @Test
    public void mTwoSum() {
       int[] nums =new int[]{2, 7, 11, 15};
       int target = 9;
       int z[]=new TwoNumSum().mTwoSum(nums,target);
       System.out.println("{"+z[0]+","+z[1]+"}");
    }
}