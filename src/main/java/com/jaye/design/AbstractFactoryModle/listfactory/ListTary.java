package com.jaye.design.AbstractFactoryModle.listfactory;

import com.jaye.design.AbstractFactoryModle.factory.Tary;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 14:38
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class ListTary extends Tary{
    public ListTary(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        return null;
    }
}
