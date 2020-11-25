package com.brave.solid.model;

import lombok.Data;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description
 * @createTime 2020年11月25日 10:43:00
 */
@Data
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
