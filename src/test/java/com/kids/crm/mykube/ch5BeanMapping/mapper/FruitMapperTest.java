package com.kids.crm.mykube.ch5BeanMapping.mapper;

import com.kids.crm.mykube.ch5BeanMapping.dto.AppleDto;
import com.kids.crm.mykube.ch5BeanMapping.dto.FruitDto;
import com.kids.crm.mykube.ch5BeanMapping.dto.GrapeDto;
import com.kids.crm.mykube.ch5BeanMapping.model.Apple;
import com.kids.crm.mykube.ch5BeanMapping.model.Fruit;
import com.kids.crm.mykube.ch5BeanMapping.model.Grape;
import com.kids.crm.mykube.ch5BeanMapping.model.SizeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitMapperTest {

    @Test
    public void createApple(){
        FruitDto apple = new AppleDto();
        apple.setName("FF");
        Fruit retrieved = FruitMapper.INSTANCE.toFruit(apple);
        System.out.println(retrieved);
        assertEquals(retrieved.getName(), "FF");
        assertEquals(((Apple) retrieved).getSizeType(), SizeType.LARGE);
    }

    @Test
    public void createGrapeFails(){
        FruitDto apple = new GrapeDto();
        apple.setName("GR");
        Fruit retrieved = FruitMapper.INSTANCE.toFruit(apple);
        System.out.println(retrieved);
        assertEquals(retrieved.getName(), "GR");
        assertEquals(((Grape) retrieved).getSizeType(), SizeType.LARGE);
    }

}