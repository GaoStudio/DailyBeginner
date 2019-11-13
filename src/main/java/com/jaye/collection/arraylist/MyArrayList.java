package com.jaye.collection.arraylist;

import com.jaye.bean.User;

import java.util.*;
import java.util.function.Consumer;

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
    public static void  printValur(String str){
        System.out.println("print value : "+str);
    }
    public void show(){
        List<String> al = Arrays.asList("a", "b", "c", "d");
        al.forEach(MyArrayList::printValur);
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
    public void IteratorList(){
        Iterator mIterator= mList.iterator();
        while (mIterator.hasNext()) {
            mIterator.next();
            mIterator.remove();
        }
        System.out.println(mList.size()+"");
    }

    public void SubList(){
        List mSublist = mList.subList(0,1);
        Consumer<User> consumer = (users) ->{System.out.println(users.getUserName());};
        mList.forEach(consumer);
        //mSublist.subList();
        //mList.forEach();
    }
}
