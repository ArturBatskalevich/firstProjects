package main.java.ru.netology.homework4.Ex1;

import java.util.Scanner;

public class Main {



    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Операция над double/float: ");
        System.out.println("1.Сравнить");
        System.out.println("2.Округлить");
        System.out.println("3.Отбросить дробную часть");
        System.out.println("");
        System.out.println("Выберите необходимую операцию и введите цифру");

        int numberOfSelected = scanner.nextInt();

        switch (numberOfSelected){
            case 1:
                double eps = 0.001;
                System.out.println("Введите первое число:");
                float firstOfNumber = scanner.nextFloat();
                System.out.println("Введите второе число:");
                double secondOfNumber = scanner.nextDouble();
                System.out.print("Результат: ");
                if (Math.abs(firstOfNumber - secondOfNumber) < eps) {
                    System.out.print("Числа равны");
                } else if ((firstOfNumber - secondOfNumber) > 0) {
                    System.out.print("Первое число больше второго");
                } else {
                    System.out.print("Второе число больше первого");
                }
                break;
            case 2:
                System.out.println("Введите число, которое необходимо округлить");
                double threeOfNumber = scanner.nextDouble();
                System.out.println("Результат: " + Math.round(threeOfNumber));
                break;
            case 3:
                System.out.println("Введите число:");
                float fourOfNumber = scanner.nextFloat();
                System.out.println("Результат: " + (long)Math.floor(fourOfNumber));
                break;
            default:
                System.out.println("Некорректный ввод!");
        }
    }
}
