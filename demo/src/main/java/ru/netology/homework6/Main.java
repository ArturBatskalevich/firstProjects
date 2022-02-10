package ru.netology.homework6;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Author author = new Author("Джек Лондон","США");
        System.out.println(author);
        Author author1 = new Author("Александр Дюма","Франция");
        System.out.println(author1);
        Author author2 = new Author("Вениамин Каверин","Россия");
        System.out.println(author2);
        System.out.println("");

        Book book1 = new Book("Два капитана", "Москва", 720, 1940, author2);
        System.out.println(book1);
        System.out.println("Самая большая книга: " + Book.biggestBook + " страниц");
        System.out.println("Книга написана до Второй Мировой Войны? " + book1.createdBeforeWorldWarTwo());
        System.out.println("Размер книги: " + book1.volumeOfTheBook());
        System.out.println("");

        Book book2 = new Book("Мартин Иден", 378, 1909, author);
        System.out.println(book2);
        System.out.println("Самая большая книга в библиотеке: " + Book.biggestBook + " страниц");
        System.out.println("Книга написана до Второй Мировой Войны? " + book2.createdBeforeWorldWarTwo());
        System.out.println("Размер книги: " + book2.volumeOfTheBook());
        System.out.println("");

        Book book3 = new Book("Граф Монте-Кристо", 1248, 1844, author1 );
        System.out.println(book3);
        System.out.println("Самая большая книга в библиотеке: : " + Book.biggestBook + " страниц");
        System.out.println("Книга написана до Второй Мировой Войны? " + book3.createdBeforeWorldWarTwo());
        System.out.println("Размер книги: " + book3.volumeOfTheBook());
        System.out.println("");

        Book book4 = new Book("Зов предков", "Киев", 165,1903, author);
        System.out.println(book4);
        System.out.println("Самая большая книга в библиотеке:: " + Book.biggestBook + " страниц");
        System.out.println("Книга написана до Второй Мировой Войны? " + book4.createdBeforeWorldWarTwo());
        System.out.println("Размер книги: " + book4.volumeOfTheBook());
        System.out.println("");

        System.out.println("Всего книг: " + Book.numberOfBooks);
        System.out.println("");



        User user = new User("Иванов","Иван","ivanovivan@gmail.com", new Book[] {book1, book2});
        System.out.println(user);
        User user1 = new User("Петров","Петр","pertovpetr@gmail.com", new Book[] {book2});
        System.out.println(user1);
        User user3 = new User("Кирилл", "Кириллов", "kirillkirillov.gmail.com",new Book[] {book3});
        System.out.println(user3);
        System.out.println("");
        System.out.println("Количество пользователей: " + User.numberOfUsers);







    }

}
