package com.jaye.design.DecoratorModle;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-07 10:47
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class UndownBorderDecorator extends Decorator{

    public UndownBorderDecorator(Display display) {
        super(display);
    }

    @Override
    protected void display() {
        System.out.println("+----------+");
        display.display();
        System.out.println("+----------+");
    }
}
