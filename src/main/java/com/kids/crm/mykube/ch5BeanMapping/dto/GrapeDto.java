package com.kids.crm.mykube.ch5BeanMapping.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrapeDto extends FruitDto {
    private SizeDifferentType sizeType;
}
