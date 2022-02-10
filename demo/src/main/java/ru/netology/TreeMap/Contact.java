package ru.netology.TreeMap;

import java.util.Objects;

public class Contact  {

    protected String name;
    protected String surname;
    protected String phone;
    protected Group group;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Contact(String name, String surname, String number, Group group) {
        this.name = name;
        this.surname = surname;
        this.phone = number;
        this.group = group;
    }



    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(phone);
    }



    @Override
    public boolean equals(Object obj) {
        return phone.equals(((Contact) obj).phone);
    }
}
