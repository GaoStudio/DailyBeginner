package com.jaye.design.AbstractFactoryModle.listfactory;

import com.jaye.design.AbstractFactoryModle.factory.Link;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:59
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class ListLink extends Link{
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\""+url+"\"+>"+caption+"</a></li>";
    }
}
