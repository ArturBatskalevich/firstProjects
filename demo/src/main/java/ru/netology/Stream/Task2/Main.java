package ru.netology.Stream.Task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        long countYoung = persons.stream()
                .filter(person -> person.getAge() < 18)
                .count();

        List<String> listOfConscript = persons.stream()
                .filter(person -> person.getSex().equals(Sex.MAN))
                .filter(person -> person.getAge() <= 27 && person.getAge() >= 18)
                .map(person -> person.getFamily())
                .collect(Collectors.toList());

        List<String> ableBodiedIndividuals = persons.stream()
                .filter(person -> person.education.equals(Education.HIGHER))
                .filter(person -> person.getSex().equals(Sex.MAN) && person.getAge() <= 65 && person.getAge() >= 18
                                || person.getSex().equals(Sex.WOMAN) && person.getAge() <= 60 && person.getAge() >= 18)
                .map(person -> person.getFamily())
                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.toList());

        long ableBodiedIndividuals1 = persons.stream()
                .filter(person -> person.education.equals(Education.HIGHER))
                .filter(person -> person.getSex().equals(Sex.MAN) && person.getAge() <= 65 && person.getAge() >= 18
                        || person.getSex().equals(Sex.WOMAN) && person.getAge() <= 60 && person.getAge() >= 18)
                .count();

        System.out.println("Фамилии призывников (т.е. мужчин от 18 и до 27 лет): " + listOfConscript);
        System.out.println("Количество несовершеннолетних (т.е. людей младше 18 лет): " + countYoung);
        System.out.println("Cписок потенциально работоспособных людей с высшим образованием в выборке" +
                " (т.е. людей с высшим образованием от 18 до 60 лет для женщин и до 65 лет для мужчин):  " + ableBodiedIndividuals);
        System.out.println("Количество работоспособных людей: " + ableBodiedIndividuals1);
    }
}
