package com.kids.crm.mykube.ch1basic.model;

import com.kids.crm.mykube.ch1basic.dto.StudentDto;
import com.kids.crm.mykube.ch1basic.mapper.StudentMapper;
import com.kids.crm.mykube.common.StudentCreateUtil;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    public void mapping(){
        StudentDto studentDto = StudentCreateUtil.createStudentDto();
        System.out.println(StudentMapper.INSTANCE.toStudent(studentDto));
    }

}