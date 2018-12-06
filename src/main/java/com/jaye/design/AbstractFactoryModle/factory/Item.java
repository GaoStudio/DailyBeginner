package com.jaye.design.AbstractFactoryModle.factory;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:29
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHtml();
}
