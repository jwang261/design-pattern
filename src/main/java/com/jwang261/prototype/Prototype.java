package com.jwang261.prototype;

/**
 * @author jwang261
 * @date 2021/1/27 4:23 PM
 */
public class Prototype {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("101", 0, "white");
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println(sheep2.id);
    }
}
