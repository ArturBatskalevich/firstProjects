package ru.netology.HashCollections.ListOfStudents;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Students> map = new HashSet<>();

        try {
            while (true) {


                System.out.println("Введите информацию о студенте: через запятую 'ФИО, номер группы," +
                        " номер студенческого билета', или введите 'end'");

                String input = scanner.nextLine();

                if (input.equals("end")) {
                    System.out.println(map);
                    break;
                } else {
                    String[] date = input.split(",");
                    map.add(new Students(date[0], date[1], date[2]));

                }
            }



        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Неверныые данные");
        }
    }
}

