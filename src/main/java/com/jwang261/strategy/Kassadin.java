package com.jwang261.strategy;

import com.jwang261.strategy.strategies.AttackStrategy;
import com.jwang261.strategy.strategies.ItemStrategy;
import com.jwang261.strategy.strategies.SupportStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 7:06 PM
 */
public class Kassadin extends Champion{

    public Kassadin(AttackStrategy attack, SupportStrategy support, ItemStrategy item) {
        super(attack, support, item);
    }
}
