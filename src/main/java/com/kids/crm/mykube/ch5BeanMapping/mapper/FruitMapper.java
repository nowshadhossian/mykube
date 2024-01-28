package com.kids.crm.mykube.ch5BeanMapping.mapper;


import com.kids.crm.mykube.ch5BeanMapping.dto.AppleDto;
import com.kids.crm.mykube.ch5BeanMapping.dto.FruitDto;
import com.kids.crm.mykube.ch5BeanMapping.model.Apple;
import com.kids.crm.mykube.ch5BeanMapping.model.Fruit;
import com.kids.crm.mykube.ch5BeanMapping.model.Grape;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.SubclassMapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = FruitFactory.class)
public interface FruitMapper {
    FruitMapper INSTANCE = Mappers.getMapper( FruitMapper.class );

    @BeanMapping(resultType= Apple.class)
//    @BeanMapping(resultType= Grape.class) multiple annotatuion not alloweed
    public Fruit toFruit(FruitDto fruitDto);


}
