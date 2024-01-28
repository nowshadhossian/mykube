package com.kids.crm.mykube.ch3update.model.model;



import com.kids.crm.mykube.ch1basic.dto.StudentDto;
import com.kids.crm.mykube.ch1basic.model.Student;
import com.kids.crm.mykube.ch3update.model.mapper.StudentMapper;
import com.kids.crm.mykube.common.StudentCreateUtil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void updateStudent(){
        StudentDto studentDto = StudentCreateUtil.createStudentDto();
        Student converted = StudentMapper.INSTANCE.toStudent(studentDto);
        Assertions.assertThat(converted.getName()).isEqualTo("Kakarot");
        converted.setName("Changed");
        System.out.println(converted);
        StudentMapper.INSTANCE.update(converted, studentDto);
        Assertions.assertThat(studentDto.getName()).isEqualTo("Changed");
    }


}