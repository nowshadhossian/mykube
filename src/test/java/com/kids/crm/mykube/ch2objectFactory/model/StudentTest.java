package com.kids.crm.mykube.ch2objectFactory.model;

import com.kids.crm.mykube.ch2objectFactory.dto.StudentDto;
import com.kids.crm.mykube.common.StudentCreateUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void createInstanceWithObjectFactory() {
        StudentDto student = StudentCreateUtil.createStudentDto();

    }

}