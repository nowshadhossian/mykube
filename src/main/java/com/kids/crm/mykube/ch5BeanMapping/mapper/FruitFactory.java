package com.kids.crm.mykube.ch5BeanMapping.mapper;

import com.kids.crm.mykube.ch5BeanMapping.model.Apple;
import com.kids.crm.mykube.ch5BeanMapping.model.Grape;
import com.kids.crm.mykube.ch5BeanMapping.model.SizeType;

public class FruitFactory {
    public Apple createApple(){
        Apple apple = new Apple();
        apple.setSizeType(SizeType.LARGE);
        return apple;
    }

    public Grape createGrape(){
        Grape grape = new Grape();
        return grape;
    }
}
