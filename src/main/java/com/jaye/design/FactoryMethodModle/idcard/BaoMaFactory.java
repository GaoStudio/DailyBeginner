package com.jaye.design.FactoryMethodModle.idcard;

import com.jaye.design.FactoryMethodModle.framework.Car;
import com.jaye.design.FactoryMethodModle.framework.Factory;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-06 15:14
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class BaoMaFactory extends Factory{
    @Override
    public Car createCar(String owner) {
        return new BaoMaCar();
    }
}
