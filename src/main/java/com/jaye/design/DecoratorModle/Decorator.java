package com.jaye.design.DecoratorModle;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-07 10:42
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class Decorator extends Display{
    protected Display display;

    public Decorator(Display display) {
        this.display = display;
    }
}
