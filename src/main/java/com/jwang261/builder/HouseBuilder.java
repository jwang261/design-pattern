package com.jwang261.builder;

import lombok.Data;

/**
 * @author jwang261
 * @date 2021/1/26 2:13 AM
 */
//抽象建造者
@Data
public abstract class HouseBuilder {

    protected House house = new House();

    //建造流程
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();

    //建造房子
    public House buildHouse(){
        return house;
    }

}
