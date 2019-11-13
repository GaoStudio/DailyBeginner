package com.jaye.design.AbstractFactoryModle.factory;

import java.util.ArrayList;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:32
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class Tary extends Item{
    private ArrayList tarys = new ArrayList();
    public Tary(String caption) {
        super(caption);
    }
    public void add(Item item){
        tarys.add(item);
    }
}
