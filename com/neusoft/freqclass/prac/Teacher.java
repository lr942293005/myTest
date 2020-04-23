package com.neusoft.freqclass.prac;

import java.util.Objects;

/**
 * @Author: wwb
 * @Date: 2020/4/16 08:53
 */
public class Teacher{

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startWork(int time){
        System.out.println(this.name + "在" +time + "上班了");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id.equals(teacher.id) &&
                name.equals(teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
