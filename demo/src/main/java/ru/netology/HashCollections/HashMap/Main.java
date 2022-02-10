package ru.netology.HashCollections.HashMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> key = new ArrayList<>();

        Map<String, Contact> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа справочник");

        while (true) {

            System.out.println("Введите название группы контактов или 'нет': (или введите введите end)");

            String input = scanner.nextLine();

            if (input.equals("нет")) {
                System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
                String input2 = scanner.nextLine();
                if (input2.equals("нет")) {
                    System.out.println("Группы в справочнике:");
                    System.out.println(key);

                } else {
                    String[] logins = input2.split(" ");
                    String parts1 = logins[0];
                    String parts2 = logins[1];

                    System.out.println("Укажите группа контакта через пробел : " +
                            key);

                    String groupsString = scanner.nextLine();
                    String[] groups = groupsString.split(" ");

                    System.out.println("Группы которым принадлежит контакт " + Arrays.toString(groups));
                    Contact contact = new Contact(parts1, parts2);
                    final HashMap<String, List<Contact>> result = add(Arrays.asList(groups), contact);

                    final List<String> resultGroups = new ArrayList<>();
                    for (String k : result.keySet()) {
                        List<Contact> contacts = result.get(k);
                        if (contacts.contains(contact)) {
                            resultGroups.add(k);
                        }

                    }

                    System.out.println("Группы в которые добавлен контакт - " + resultGroups);

                }

            } else if(input.equals("end")) {
                System.out.println(map);

//                for (String e : key){
//                    System.out.println(map.get(e));
//                }
                return;
            } else {
                key.add(input);
                System.out.println("Группа добавлена");

            }
        }
    }

    public static HashMap<String, List<Contact>> add(List<String> groups, Contact value) {

        final HashMap<String, List<Contact>> result = new HashMap<>();

        for (String key : groups) {
            List<Contact> contacts = result.get(key);
            if (contacts!= null && !contacts.contains(value)) {
                contacts.add(value);
                result.put(key, contacts);
            } else {
                result.put(key, Collections.singletonList(value));
            }
        }

        return result;


    }
}
