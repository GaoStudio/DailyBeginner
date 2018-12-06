package com.jaye.design.AbstractFactoryModle.factory;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 11:51
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public abstract class Factory {
    public static Factory getFactory(String factoryName){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(factoryName).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption,String url);
    public abstract Tary createTary(String caption);
    public abstract Page createPage(String title, String author);
}
