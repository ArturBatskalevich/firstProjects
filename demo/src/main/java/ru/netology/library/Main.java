package ru.netology.library;

public class Main {

    public static void main(String[] args){

        Book book = new Book("The Lord of the Rings");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);

        System.out.print("Текущее состояние книг - ");
        System.out.println(book.getStatus());

        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book, Status.AVAILABLE);

        System.out.print("Текущее состояние книг - ");
        System.out.println(book.getStatus());



    }
}
