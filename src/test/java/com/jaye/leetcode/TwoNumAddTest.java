package com.jaye.leetcode;

import com.jaye.leetcode.utils.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-09-05 16:36
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class TwoNumAddTest {

    @Test
    public void mAddTwoNumbers() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(9);
        ListNode result =new TwoNumAdd().mAddTwoNumbers(l1,l2);
        for (;result!=null;result=result.next){
            System.out.println(result.val);
        }
    }
}