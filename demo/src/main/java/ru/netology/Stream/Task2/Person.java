package ru.netology.Stream.Task2;

import java.util.Comparator;

public class Person {

    private String name;
    private String family;
    private Integer age;
    private Sex sex;
    public Education education;

    public Person(String name,String family,Integer age,Sex sex,Education education){
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "Name " + name + ", " +
                "Family " + family + ", " +
                "Age " + age + ", " +
                "Sex " + sex + ", " +
                "Education " + education + " }";
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    Comparator<Person> comparator = (o1, o2) -> o1.getFamily().compareTo(o2.getFamily());


}
