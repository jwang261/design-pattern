package com.jwang261.strategy.strategies.strategyImpl;

import com.jwang261.strategy.strategies.AttackStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 6:56 PM
 */
public class NonRangeAttackStrategy implements AttackStrategy {
    @Override
    public void attackEnemy() {
        System.out.println("Hit enemy by non-range attack");
    }
}
