package com.jwang261.strategy;

import com.jwang261.strategy.strategies.strategyImpl.HealStrategy;
import com.jwang261.strategy.strategies.strategyImpl.MagiItemStrategy;
import com.jwang261.strategy.strategies.strategyImpl.NoSupportStrategy;
import com.jwang261.strategy.strategies.strategyImpl.NonRangeAttackStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 7:02 PM
 */
public class Client {
    public static void main(String[] args) {
        Champion kass = new Kassadin(new NonRangeAttackStrategy(),
                new NoSupportStrategy(),
                new MagiItemStrategy());
        kass.attack();
        kass.support();
        kass.byItem();
        kass.support = new HealStrategy();
        kass.support();
    }
}
