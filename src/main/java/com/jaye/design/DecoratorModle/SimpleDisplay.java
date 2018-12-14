package com.jaye.design.DecoratorModle;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-07 10:35
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class SimpleDisplay extends Display{
    @Override
    protected void display() {
        System.out.print("内容");
    }
}
