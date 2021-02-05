package com.jwang261.strategy.strategies.strategyImpl;

import com.jwang261.strategy.strategies.AttackStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 6:55 PM
 */
public class RangeAttackStrategy implements AttackStrategy {

    @Override
    public void attackEnemy() {
        System.out.println("Hit enemy by range attack");
    }
}
