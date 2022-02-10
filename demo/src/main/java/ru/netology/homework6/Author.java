package ru.netology.homework6;

import java.util.Arrays;

public class Author {

    public String name;
    public String country;


    public Author(String name, String country) {
        this.name = name;
        this.country = country;

    }

    public String toString() {
        return "Автор: " + name + ", " + "Страна: " + country;
    }


}
