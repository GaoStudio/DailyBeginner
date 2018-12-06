package com.jaye.design.AbstractFactoryModle.listfactory;

import com.jaye.design.AbstractFactoryModle.factory.Page;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 14:39
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class ListPage extends Page{
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        return null;
    }
}
