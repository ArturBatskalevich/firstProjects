package ru.netology.homework6;

public class User {

    public static int numberOfUsers;

    public String email;
    public String name;
    public String surname;
    public Book[] books;

    public User(String surname, String name, String email, Book[] books){
        this.surname = surname;
        this.name = name;
        this.email = email;
        this.books = books;
        numberOfUsers++;
    }

    public String toString(){
        String booksArray = "";
        for (int i = 0; i < books.length; i++) {
            booksArray = booksArray + books[i] + "; ";

        }

        return name +
                " " + surname +
                " (" +
                email +
                "). " +
                "Взял книгу - " + booksArray;
    }
}
