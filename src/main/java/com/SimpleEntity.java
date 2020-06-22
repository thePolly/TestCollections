package com;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public  class SimpleEntity {
    private String name;
    private Integer age;
    private Boolean isCoolEntity;
}
