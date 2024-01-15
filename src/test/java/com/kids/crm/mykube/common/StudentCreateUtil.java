package com.kids.crm.mykube.common;

import com.kids.crm.mykube.ch1basic.dto.StudentDto;
import com.kids.crm.mykube.ch1basic.model.Organization;
import com.kids.crm.mykube.ch1basic.model.Student;

public class StudentCreateUtil {
    public static StudentDto createStudentDto() {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(2);
        studentDto.setName("Kakarot");
        studentDto.setYearsOld(21);
        var organization = new Organization();
        organization.setAddress("Uttara");
        organization.setName("Kids campus");
        studentDto.setOrganization(organization);
        return studentDto;
    }
}
