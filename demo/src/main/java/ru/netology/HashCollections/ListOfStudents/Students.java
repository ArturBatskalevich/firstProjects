package ru.netology.HashCollections.ListOfStudents;

import java.util.Objects;

public class Students {

    protected String name;
    protected String group;
    protected String studentId;

    public Students(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Группа " + getGroup();
    }

    @Override
    public boolean equals(Object obj) {
        return studentId.equals(((Students) obj).studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}

