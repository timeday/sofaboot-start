package com.sofaboot.sofa.common.dal.tables;

/**
 * @Project sofaboot-start
 * @Package com.alipay.sofa.common.dal.mapper
 * @ClassName Student
 * @Descripition TODO
 * @Author able
 * @Date 2019/8/27 11:06
 * @Version 1.0
 **/
public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}