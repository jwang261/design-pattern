package com.jwang261.prototype;

/**
 * @author jwang261
 * @date 2021/2/4 2:31 PM
 */
public class Sheep implements Cloneable{
    String id = "1";
    Integer age = 0;
    String color = "white";

    public Sheep(String id, Integer age, String color) {
        this.id = id;
        this.age = age;
        this.color = color;
    }

    //默认的克隆方法完成克隆该实例
    @Override
    protected Object clone(){

        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        return sheep;
    }
}
