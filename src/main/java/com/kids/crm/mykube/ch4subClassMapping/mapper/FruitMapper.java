package com.kids.crm.mykube.ch4subClassMapping.mapper;


import com.kids.crm.mykube.ch1basic.dto.StudentDto;
import com.kids.crm.mykube.ch1basic.model.Student;
import com.kids.crm.mykube.ch4subClassMapping.dto.AppleDto;
import com.kids.crm.mykube.ch4subClassMapping.dto.FruitDto;
import com.kids.crm.mykube.ch4subClassMapping.model.Apple;
import com.kids.crm.mykube.ch4subClassMapping.model.Fruit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassMapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FruitMapper {
    FruitMapper INSTANCE = Mappers.getMapper( FruitMapper.class );

    @SubclassMapping(source = AppleDto.class, target = Apple.class)
  //  @SubclassMapping(source = MangoDto.class, target = Mango.class)
    public Fruit toFruit(FruitDto fruitDto);


}
