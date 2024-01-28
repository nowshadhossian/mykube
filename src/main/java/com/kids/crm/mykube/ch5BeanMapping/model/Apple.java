package com.kids.crm.mykube.ch5BeanMapping.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Apple extends Fruit {
    private SizeType sizeType;
}
