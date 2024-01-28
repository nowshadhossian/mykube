package com.kids.crm.mykube.ch4subClassMapping.mapper;

import com.kids.crm.mykube.ch4subClassMapping.dto.AppleDto;
import com.kids.crm.mykube.ch4subClassMapping.dto.FruitDto;
import com.kids.crm.mykube.ch4subClassMapping.dto.GrapeDto;
import com.kids.crm.mykube.ch4subClassMapping.dto.SizeDifferentType;
import com.kids.crm.mykube.ch4subClassMapping.model.Apple;
import com.kids.crm.mykube.ch4subClassMapping.model.Grape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitMapperTest {

    @Test
    public void mapApple(){
        AppleDto fruitDto  = new AppleDto();
        fruitDto.setName("AppleN");
        fruitDto.setSizeType(SizeDifferentType.LARGE);
        assertTrue(FruitMapper.INSTANCE.toFruit(fruitDto) instanceof Apple);
        Apple converted = (Apple) FruitMapper.INSTANCE.toFruit(fruitDto);
        System.out.println(converted.getName());
    }

    @Test
    public void mapGrapeIsFalse(){
        GrapeDto fruitDto  = new GrapeDto();
        fruitDto.setName("GrapeG");
        fruitDto.setSizeType(SizeDifferentType.LARGE);
        assertFalse(FruitMapper.INSTANCE.toFruit(fruitDto) instanceof Grape);
    }

}