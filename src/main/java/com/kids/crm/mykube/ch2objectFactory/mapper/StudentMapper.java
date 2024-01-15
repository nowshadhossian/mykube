package com.kids.crm.mykube.ch2objectFactory.mapper;

import com.kids.crm.mykube.ch1basic.dto.StudentDto;
import com.kids.crm.mykube.ch1basic.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    com.kids.crm.mykube.ch1basic.mapper.StudentMapper INSTANCE = Mappers.getMapper( com.kids.crm.mykube.ch1basic.mapper.StudentMapper.class );

    @Mapping(source = "studentDto.yearsOld", target = "age")
    public Student toStudent(StudentDto studentDto);
}