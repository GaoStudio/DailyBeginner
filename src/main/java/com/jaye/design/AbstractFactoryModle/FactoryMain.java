package com.jaye.design.AbstractFactoryModle;

import com.jaye.design.AbstractFactoryModle.factory.Factory;
import com.jaye.design.AbstractFactoryModle.factory.Link;
import com.jaye.design.AbstractFactoryModle.factory.Page;
import com.jaye.design.AbstractFactoryModle.factory.Tary;
import com.jaye.design.AbstractFactoryModle.listfactory.ListFactory;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:28
 * Email: gaoweivf@aliyun.com
 * Description: 抽象工厂模式
 **/

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new ListFactory();
        Link baidu = factory.createLink("百度","www.baidu.com");
        Link tencent = factory.createLink("腾讯","www.qq.com");
        Tary tary = factory.createTary("互联网");
        tary.add(baidu);
        tary.add(tencent);
        Page page = factory.createPage("Page","gaowei");
        page.add(tary);
        page.output();
    }
}
