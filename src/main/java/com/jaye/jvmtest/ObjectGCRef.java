package com.jaye.jvmtest;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-11-20 11:37
 * Email: gaoweivf@aliyun.com
 * Description:
 **/
class Dog {
    public Cat mCat;
}
class Cat{
    public Dog mDog;
}
public class ObjectGCRef {
    public static void main(String args[]){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.mCat = cat;
        cat.mDog = dog;
        dog = null;
        cat = null;

        System.gc();

    }
}
