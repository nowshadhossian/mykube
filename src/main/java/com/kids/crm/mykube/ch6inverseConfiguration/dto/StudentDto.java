package com.kids.crm.mykube.ch6inverseConfiguration.dto;

import com.kids.crm.mykube.ch6inverseConfiguration.model.Organization;
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
