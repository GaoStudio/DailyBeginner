package com.jaye.collection;

import com.jaye.collection.bean.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-10-17 13:37
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class MyArrayList {
    private ArrayList mList;
    User user;
    User user1;
    public MyArrayList(){
        user = new User();
        user1 = new User();
        user.setUserName("gaowei");
        user1.setUserName("gaowei");
        mList = new ArrayList();
        mList.add(user);
        mList.add(user1);

    }
    public void add(){
        System.out.println(mList.indexOf(user1));
    }
    public void mClone(){

        ArrayList mClone = (ArrayList) mList.clone();
        ((User)mList.get(0)).setUserName("good man");
        System.out.println(mClone.size());
        System.out.println(((User)mClone.get(0)).getUserName());
    }
}
