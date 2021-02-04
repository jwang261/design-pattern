package com.jwang261.builder;

import lombok.Data;

/**
 * @author jwang261
 * @date 2021/1/26 2:21 AM
 */
//指挥着去指定制造流程
@Data
public class HouseDirector {
    HouseBuilder houseBuilder = null;


    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //具体建造流程在这儿指挥 ———— 如何处理建造房子的流程
    public House build(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        House house = houseBuilder.buildHouse();
        return house;
    }
}
