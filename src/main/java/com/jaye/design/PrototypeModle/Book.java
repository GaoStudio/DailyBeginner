package com.jaye.design.PrototypeModle;

import java.io.Serializable;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 09:40
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class Book implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
