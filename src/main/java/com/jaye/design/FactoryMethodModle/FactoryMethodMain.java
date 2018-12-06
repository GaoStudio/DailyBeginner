package com.jaye.design.FactoryMethodModle;

import com.jaye.design.FactoryMethodModle.framework.Car;
import com.jaye.design.FactoryMethodModle.framework.Factory;
import com.jaye.design.FactoryMethodModle.idcard.BenChiFactory;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 13:23
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory benChiFactory = new BenChiFactory();
        Car c200 =  benChiFactory.createCar("C200");
        Car c350 = benChiFactory.createCar("c350");

    }
}
