package ru.netology.TreeMap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    private static Map<String, Contact> contacts = new HashMap<>();
    private static Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            System.out.println("Программа: пропущенные вызовы.");

            while (true) {

                System.out.println("Меню: ");
                System.out.println("1. Добавить контакт ");
                System.out.println("2. Добавить пропущенный вызов ");
                System.out.println("3. Вывести все пропущенные вызовы ");
                System.out.println("4. Очистить пропущенные вызовы ");
                System.out.println("5. Выход ");
                System.out.println("Выберите пункт из меню (1-4): ");


                String input = scanner.nextLine();
                int menu = Integer.parseInt(input);

                switch (menu) {

                    case 1:
                        addContact();
                        break;
                    case 2:
                        addMissedCall();
                        break;
                    case 3:
                        findOfContact();
                        break;
                    case 4:
                        missedCalls.clear();
                        System.out.println("Список пропущенных вызовов очищен");
                        break;
                    case 5:
                        System.out.println("Выход и прогруммы");
                        return;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addContact() {
        System.out.println("Введите через 'запятую' : имя, фамилия, номер телефона," +
                " группа контакта: FAMILY,FRIENDS,WORK");
        String input2 = scanner.nextLine();
        String[] phoneBook = input2.split(",");
        contacts.put(phoneBook[2], new Contact(phoneBook[0], phoneBook[1], phoneBook[2], Group.valueOf(phoneBook[3].toUpperCase())));
    }

    public static void addMissedCall() {
        System.out.println("Введите время вызова (\"yyyy-MM-dd HH:mm:ss\") и номер телефона через 'запятую'");
        String input3 = scanner.nextLine();
        String[] timeEndPhone = input3.split(",");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        final LocalDateTime consoleDate = LocalDateTime.parse(timeEndPhone[0], formatter);
        final String consolePhone = timeEndPhone[1];

        missedCalls.put(consoleDate, consolePhone);
    }

    public static void findOfContact() {
        for (LocalDateTime time : missedCalls.keySet()) {
            System.out.print("Вызов " + time + " ");
            if (contacts.containsKey(missedCalls.get(time))) {
                System.out.println(contacts.get(missedCalls.get(time)));
            } else {
                System.out.println(missedCalls.get(time));

            }
        }


    }
}





