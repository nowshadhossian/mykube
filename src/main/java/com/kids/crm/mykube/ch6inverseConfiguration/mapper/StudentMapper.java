package com.kids.crm.mykube.ch6inverseConfiguration.mapper;


import com.kids.crm.mykube.ch6inverseConfiguration.dto.StudentDto;
import com.kids.crm.mykube.ch6inverseConfiguration.model.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper( StudentMapper.class );

    @Mapping(source = "studentDto.yearsOld", target = "age")
    public Student toStudent(StudentDto studentDto);

    public StudentDto toStudentDto(Student studentDto);

    @InheritInverseConfiguration
    public StudentDto toStudentDtoInverse(Student studentDto);
}