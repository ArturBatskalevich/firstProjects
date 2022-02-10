package ru.netology.homework6;

public class Book {

    public static int biggestBook;
    public static int numberOfBooks;

    public String name;
    public String publishingHouse;
    public int numberOfPages;
    public int year;
    public Author author;


    public Book(String name, String publishingHouse, int numberOfPages, int year, Author author){

        this.year = year;
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.author = author;
        biggestBook = Math.max(biggestBook, numberOfPages);
        numberOfBooks++;

    }

    public Book(String name, int numberOfPages, int year, Author author){

        this.year = year;
        this.name = name;
        this.publishingHouse = "СССР";
        this.numberOfPages = numberOfPages;
        this.author = author;
        biggestBook = Math.max(biggestBook, numberOfPages);
        numberOfBooks++;

    }

    public String toString(){
        return name + ", " + "Издательство: " + publishingHouse + ", " + "Количество страниц: " + numberOfPages + ", " + "Год написания: " + year + " " + author;
    }

    public boolean createdBeforeWorldWarTwo() {
        return  year < 1939;

    }

    public String volumeOfTheBook(){
        String result = "Малая книга";

        if (numberOfPages >= 300 && numberOfPages <= 1000){
            result = "Средняя книга";
        } else if (numberOfPages > 1000) {
            result = "Большая книга";
        }
        return result;
    }



}

