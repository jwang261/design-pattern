package com.jwang261.strategy.strategies.strategyImpl;

import com.jwang261.strategy.strategies.SupportStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 7:04 PM
 */
public class NoSupportStrategy implements SupportStrategy {
    @Override
    public void supportAlly() {
        System.out.println("No support for allies");
    }
}
