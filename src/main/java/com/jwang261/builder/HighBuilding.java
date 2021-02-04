package com.jwang261.builder;

import lombok.Data;

/**
 * @author jwang261
 * @date 2021/1/26 2:17 AM
 */
@Data
public class HighBuilding extends HouseBuilder {

    public void buildBase() {
        System.out.println("High Base");
    }

    public void buildWall() {
        System.out.println("High Wall");

    }

    public void buildRoof() {
        System.out.println("High Roof");

    }
}
