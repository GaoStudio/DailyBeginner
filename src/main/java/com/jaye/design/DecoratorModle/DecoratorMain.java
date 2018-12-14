package com.jaye.design.DecoratorModle;

import java.io.*;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-07 10:34
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class DecoratorMain {
    public static void main(String[] args) {
        Display display = new SimpleDisplay();
        display =new UndownBorderDecorator(new SileBorderDecorator(display));
        display.display();
        try {
            Reader reader = new LineNumberReader(new BufferedReader(new FileReader(new File("demo.txt"))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
