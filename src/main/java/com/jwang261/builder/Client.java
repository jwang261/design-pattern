package com.jwang261.builder;

/**
 * @author jwang261
 * @date 2021/1/26 2:36 AM
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 建造者模式：
 * 适用范围：创建的产品一般具有较多的共同点。
 * 1、抽象Builder类
 *     - 定义共用抽象的方法 - base/wall/roof
 *     - 定义实例对象 - house
 *     - get方法来得到构建完的实例对象
 * 2、实际的不同子类建造者来继承抽象Builder
 *     - 重写方法
 * 3、定义Director
 *     - 构造方法传入实例建造者子类对象 - common/high
 *     - 定义Director中的build方法，调用建造者内部的所有build方法并返回实例House
 * 4、客户端创建真实建造者并通过前者创建Director完成建造
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        CommonHouse commonHouse = new CommonHouse();
        //创建房子指挥者
        House house = new HouseDirector(commonHouse).build();

    }
}
