package com.kids.crm.mykube.ch1basic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private Organization organization;
    private int age;


}