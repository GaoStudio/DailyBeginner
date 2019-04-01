package com.jaye.basic;

import java.util.Random;

public class BasicMain {
    private static final SubBasicMain j  = new SubBasicMain("A");
    public BasicMain(){
        //j = 0;
    }
    private void add(){}
    //private static final SubConstMain subConstMain= new SubConstMain();
    public static void main(String[] args) {
        SubBasicMain subBasicMain = new SubBasicMain("A");
        subBasicMain = new SubBasicMain("B");
        subBasicMain.show();
        String s = "A";
        s = s + "B";
        System.out.println(s);
        BasicMain.j.show();
        BasicMain.j.setS("SSS");
        BasicMain.j.show();
        //System.out.println();

        System.out.println(SubConstMain.staticString);
    }
}
class SubConstMain{
    public static String staticString  = "staticString";
    public static final String staticFinalString  = "staticFinalString";
    public SubConstMain(){
        System.out.println("SubConstMain");
    }
}
final class SubBasicMain{
    private String s;
    public SubBasicMain(String s){
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void show(){
        System.out.println(s);
    }

}