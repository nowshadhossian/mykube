package com.kids.crm.mykube.ch3update.model.mapper;


import com.kids.crm.mykube.ch1basic.dto.StudentDto;
import com.kids.crm.mykube.ch1basic.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper( StudentMapper.class );

    @Mapping(source = "studentDto.yearsOld", target = "age")
    public Student toStudent(StudentDto studentDto);

    void update(Student student, @MappingTarget StudentDto studentDto);
}
