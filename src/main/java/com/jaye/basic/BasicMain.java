package com.jaye.basic;

import sun.util.resources.fr.CurrencyNames_fr_CA;

import java.util.Random;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2019-01-15 09:30
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class BasicMain extends BasicMainFather{
    public static final int FACTOR = new Random().nextInt(10);
    static {
        System.out.println("BasicMain: static");
    }

    public BasicMain() {
        System.out.println("BasicMain: construstor");
    }
    public static void main(String[] args) {
        new BasicMain();
        //float a = 0.1f;
        //float b = 0.2f;
        //if(a+b==0.3){
        //    System.out.println("相等");
        //}
        String s = new String("Café \uD83C\uDF69");
        System.out.println(s);
        System.out.println(s.length()+"");
        //System.out.println(Integer.toBinaryString(Float.floatToIntBits(a)));
        //System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a+b)));
        //System.out.println("FACTOR:"+FACTOR);
    }
}
class BasicMainFather{
    static {
        System.out.println("BasicMainFather: static");
    }

    public BasicMainFather() {
        System.out.println("BasicMainFather: construstor");
    }

}