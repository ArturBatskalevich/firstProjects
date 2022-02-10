package ru.netology.Queue.Elevator;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> elevator = new ArrayDeque<>();

        final int waitDoorsInSeconds = 10;
        final int waitMoveInSeconds = 5;
        final int numberFloors = 25;
        int totalSeconds = 0;
        int previousFloor = 1;

        while (true) {

            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String floor = scanner.nextLine();

            try {

                int num = Integer.parseInt(floor);
                if (num == 0) {
                    System.out.println("Лифт проследовал по следующим этажам: ");

                    while (!elevator.isEmpty()) {
                        if (elevator.size() > 1) {
                            System.out.print("этаж " + elevator.poll() + " -> ");
                        } else {
                            System.out.print("этаж " + elevator.poll() + " - ");
                        }
                    }
//                    for (int i : elevator) {
//                        System.out.print("этаж " + i + " -> ");
//                    }
                    System.out.println("весь маршрут");
                    System.out.println("Время затраченное лифтом на маршрут = " + totalSeconds + " с.");
                    return;

                } else if (num > 0 && num <= numberFloors) {

                    elevator.add(num);

                    totalSeconds += Math.abs((num - previousFloor) * waitMoveInSeconds);
                    totalSeconds += waitDoorsInSeconds;
                    previousFloor = num;


                } else {
                    System.out.println("Такого этажа нет в доме ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
