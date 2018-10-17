package com.jaye.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
 */
public class TwoNumSum {
    /**
     * @param nums
     * @param target
     * @return
     */
    public int[] mTwoSum(int[] nums, int target) {
        Map<Integer, Integer> container = new HashMap<>();
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            if(container.containsKey(nums[i])){
                first = container.get(nums[i]);
                second = i;
                break;
            }else {
                container.put(target-nums[i],i);
            }
        }
        return new int[]{first,second};
    }
}
