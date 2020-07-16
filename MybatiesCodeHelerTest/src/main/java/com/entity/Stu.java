package com.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Stu {
    private Integer id;

    private String name;

    private Integer age;

    private String address;
}