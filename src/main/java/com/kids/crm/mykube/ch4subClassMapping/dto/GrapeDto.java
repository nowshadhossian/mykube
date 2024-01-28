package com.kids.crm.mykube.ch4subClassMapping.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrapeDto extends FruitDto{
    private SizeDifferentType sizeType;
}
