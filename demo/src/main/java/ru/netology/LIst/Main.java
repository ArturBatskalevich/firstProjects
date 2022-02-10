package ru.netology.LIst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {

            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");


            String input = scanner.nextLine();
            int number = Integer.parseInt(input);

            switch (number) {
                case 1:

                    boolean a1 = true;
                    while (a1) {

                        System.out.println("Введите задачу для планирования(для выхода введите end)");
                        String task = scanner.nextLine();
                        if (task.equals("end")) {
                            a1 = false;
                        } else {
                            list.add(task);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Список дел:");
                    int i = 1;
                    for (String art : list) {
                        System.out.println(i + "." + art);
                        i++;
                    }
                    System.out.println(" ");
                    break;
                case 0:
                    return;
                case 3:

                    boolean a2 = true;
                    while (a2) {

                        System.out.println("Введите номер задачи: ");

                        String del = scanner.nextLine();
                        int delete = Integer.parseInt(del);

                        if (delete < 0 || delete > list.size()) {
                            a2 = false;
                            System.out.println("Некорректный ввод");
                            System.out.println(" ");
                        } else {
                            list.remove((delete) - 1);
                            System.out.println("Задача удалена");
                            System.out.println(" ");
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }
}

