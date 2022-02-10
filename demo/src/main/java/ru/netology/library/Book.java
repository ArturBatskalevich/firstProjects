package ru.netology.library;

public class Book {
    private String name;
    private Status status;

    public Book(String name){
        this.name = name;
        status = Status.AVAILABLE;
    }

    public Book(String name, Status status){
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return name;
    }
}
