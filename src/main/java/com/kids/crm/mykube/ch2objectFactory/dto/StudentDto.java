package com.kids.crm.mykube.ch2objectFactory.dto;

import com.kids.crm.mykube.ch2objectFactory.model.Organization;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentDto {
    private int id;
    private String name;
    private Organization organization;
    private int yearsOld;


}
