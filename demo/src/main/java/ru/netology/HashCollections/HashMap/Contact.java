package ru.netology.HashCollections.HashMap;

import java.util.Objects;

public class Contact {

    protected String name;
    protected String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + ", Телефон: " + getNumber();
    }

    @Override
    public boolean equals(Object obj) {
        return number.equals(((Contact) obj).number) && name.equals(((Contact) obj).name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
