package com.kids.crm.mykube.ch4subClassMapping.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppleDto extends FruitDto {
    private SizeDifferentType sizeType;
}
