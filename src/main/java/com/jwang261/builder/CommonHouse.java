package com.jwang261.builder;

/**
 * @author jwang261
 * @date 2021/1/26 2:15 AM
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("Common Base");
    }

    @Override
    public void buildWall() {
        System.out.println("Common Wall");

    }

    @Override
    public void buildRoof() {
        System.out.println("Common Roof");

    }
}
