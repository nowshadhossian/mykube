package com.kids.crm.mykube.ch2objectFactory.mapper;

import com.kids.crm.mykube.ch2objectFactory.dto.StudentDto;
import com.kids.crm.mykube.ch2objectFactory.model.Student;

public class StudentFactory {
    public Student map(StudentDto student){
        Student result = new Student();
        student.setId(333);
        return result;
    }


}
