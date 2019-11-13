package com.jaye.design.AbstractFactoryModle.factory;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:30
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class Link extends Item{
    public String url;
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
