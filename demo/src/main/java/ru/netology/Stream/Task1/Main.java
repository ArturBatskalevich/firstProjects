package ru.netology.Stream.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveInt = new ArrayList<>();
        List<Integer> evenInt = new ArrayList<>();

        for (int i : intList) {
            if (i > 0) {
                positiveInt.add(i);
            }
        }
        System.out.println("Положительыне числа: " + positiveInt);

        for (int i : positiveInt){
            if (i % 2 == 0){
                evenInt.add(i);
            }
        }
        System.out.println("Четные числа: " + evenInt);

        Collections.sort(evenInt);

        System.out.print("Result: ");
        for (int number :evenInt) {
            System.out.print(number + " ");
        }
    }
}