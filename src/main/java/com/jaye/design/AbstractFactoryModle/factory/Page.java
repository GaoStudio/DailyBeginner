package com.jaye.design.AbstractFactoryModle.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:45
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList contents = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item){
        contents.add(item);
    }
    public void output(){
        try {
            String filename = title+".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHtml());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHtml();
}
