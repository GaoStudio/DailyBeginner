package com.jaye.design.DecoratorModle;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-07 10:44
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class SileBorderDecorator extends Decorator{
    public SileBorderDecorator(Display display) {
        super(display);
    }

    @Override
    protected void display() {
        System.out.print("||");
        display.display();
        System.out.println("||");
    }
}
