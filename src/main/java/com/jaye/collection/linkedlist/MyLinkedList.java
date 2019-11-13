package com.jaye.collection.linkedlist;

import java.util.LinkedList;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-10-20 10:46
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class MyLinkedList {
    private LinkedList<String> users;
    public void initList(){
        users = new LinkedList<>();
        users.addFirst("A");
        users.element();
        users.peek();
    }
}
