package ru.netology.homework8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework8 {



    public static void main(String[] args) {

        final int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];


        System.out.println("Матрица с рандомным выбором чисел:");
        System.out.println();

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите угол повтора матрицы на выбор 90/180/270: ");

        int input = scanner.nextInt();

        switch (input) {
            case 90:
                for (int i = 0; i <= SIZE - 1; i++) {
                    for (int j = 0; j <= SIZE - 1; j++) {
                        rotatedColors[i][j] = colors[j][(SIZE - 1) - i];
                    }
                }
                break;
            case 180:
                for (int i = 0; i <= SIZE - 1; i++) {
                    for (int j = 0; j <= SIZE - 1; j++) {
                        rotatedColors[i][j] = colors[j][i];
                    }
                }
                break;
            case 270:
                for (int i = 0; i <= SIZE - 1; i++) {
                    for (int j = 0; j <= SIZE - 1; j++) {
                        rotatedColors[i][j] = colors[(SIZE - 1) - j][i];
                    }

                }
                break;
            default:
                System.out.println("Некорректный ввод");
        }


        if (input == 90 || input == 180 || input == 270){
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }
        }
    }
}
