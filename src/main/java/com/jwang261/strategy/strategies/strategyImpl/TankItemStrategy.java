package com.jwang261.strategy.strategies.strategyImpl;

import com.jwang261.strategy.strategies.ItemStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 6:58 PM
 */
public class TankItemStrategy implements ItemStrategy {
    @Override
    public void buyItem() {
        System.out.println("Buy health item");
    }
}
