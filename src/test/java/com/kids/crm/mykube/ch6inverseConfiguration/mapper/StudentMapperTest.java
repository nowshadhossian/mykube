package com.kids.crm.mykube.ch6inverseConfiguration.mapper;

import com.kids.crm.mykube.ch6inverseConfiguration.dto.StudentDto;
import com.kids.crm.mykube.ch6inverseConfiguration.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

    @Test
    public void convertWorks(){
        StudentDto studentDto = new StudentDto();
        studentDto.setName("John");
        studentDto.setYearsOld(34);
        Student student = StudentMapper.INSTANCE.toStudent(studentDto);
        assertEquals(student.getAge(), 34);
        assertEquals(student.getName(), "John");
    }

    @Test
    public void convertsFailWhenMappingAbsent(){
        Student student = new Student();
        student.setName("John");
        student.setAge(34);
        StudentDto studentDto = StudentMapper.INSTANCE.toStudentDto(student);
        assertEquals(studentDto.getYearsOld(), 0);
        assertEquals(studentDto.getName(), "John");
    }

    @Test
    public void convertsSuccessWithInverseConfiguration(){
        Student student = new Student();
        student.setName("John");
        student.setAge(34);
        StudentDto studentDto = StudentMapper.INSTANCE.toStudentDtoInverse(student);
        assertEquals(studentDto.getYearsOld(), 34);
        assertEquals(studentDto.getName(), "John");
    }

}