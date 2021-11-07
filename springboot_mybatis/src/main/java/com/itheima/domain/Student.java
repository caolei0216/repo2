package com.itheima.domain;

public class Student {

    private Long id;
    private String age;
    private String sex;
    private String name;
    private String addrest;
    private String math;
    private String english;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", addrest='" + addrest + '\'' +
                ", math='" + math + '\'' +
                ", english='" + english + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddrest() {
        return addrest;
    }

    public void setAddrest(String addrest) {
        this.addrest = addrest;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
