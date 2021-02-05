package com.jwang261.strategy;

import com.jwang261.strategy.strategies.AttackStrategy;
import com.jwang261.strategy.strategies.ItemStrategy;
import com.jwang261.strategy.strategies.SupportStrategy;

/**
 * @author jwang261
 * @date 2021/2/4 6:52 PM
 */
public abstract class Champion {
    AttackStrategy attack;
    SupportStrategy support;
    ItemStrategy item;

    public Champion(AttackStrategy attack, SupportStrategy support, ItemStrategy item) {
        this.attack = attack;
        this.support = support;
        this.item = item;
    }

    public void attack(){
        if(attack != null) attack.attackEnemy();
    }
    public void support(){
        if(support != null) support.supportAlly();
    }
    public void byItem(){
        if(item != null) item.buyItem();
    }
}
