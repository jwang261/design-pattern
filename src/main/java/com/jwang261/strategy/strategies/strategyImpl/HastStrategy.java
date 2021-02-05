package com.jwang261.strategy.strategies.strategyImpl;

import com.jwang261.strategy.strategies.SupportStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 7:02 PM
 */
public class HastStrategy implements SupportStrategy {
    @Override
    public void supportAlly() {
        System.out.println("Hast Allies");
    }
}
