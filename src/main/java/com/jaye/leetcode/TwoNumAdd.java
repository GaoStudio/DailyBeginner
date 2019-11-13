package com.jaye.leetcode;


import com.jaye.leetcode.utils.ListNode;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-09-05 16:11
 * Email: gaoweivf@aliyun.com
 * Description: 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表
 **/


public class TwoNumAdd {
    public ListNode mAddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode((l1.val+l2.val)%10);
        ListNode result = temp;
        int init =  (l1.val+l2.val)/10;
        for (l1 = l1.next,l2=l2.next;l1!=null||l2!=null||init>0;){
            int setVal = 0;
            if(l1==null){
                if(l2!=null){
                    setVal = (l2.val+init)%10;
                    init = (l2.val+init)/10;
                    l2=l2.next;
                }else {
                    setVal = init;
                    init = 0;
                }
            }else if(l2==null){
                setVal = (l1.val+init)%10;
                init = (l1.val+init)/10;
                l1=l1.next;
            }else {
                setVal = (l1.val+l2.val+init)%10;
                init = (l1.val+l2.val+init)/10;
                l1=l1.next;
                l2=l2.next;
            }
            temp.next = new ListNode(setVal);
            temp = temp.next;
        }
        return result;
    }
}
