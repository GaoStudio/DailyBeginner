package com.jaye.design.FactoryMethodModle.framework;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-07 09:58
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class CarImpl implements Car{
    protected int i = 1;
    static {
        System.out.println("CarImpl static");
    }
}
