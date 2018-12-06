package com.jaye.design.AbstractFactoryModle.listfactory;

import com.jaye.design.AbstractFactoryModle.factory.Factory;
import com.jaye.design.AbstractFactoryModle.factory.Link;
import com.jaye.design.AbstractFactoryModle.factory.Page;
import com.jaye.design.AbstractFactoryModle.factory.Tary;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 14:29
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class ListFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tary createTary(String caption) {
        return new ListTary(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
