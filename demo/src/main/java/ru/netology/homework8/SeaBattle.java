package ru.netology.homework8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeaBattle {

    public static final int SIZE = 10;
    public static final int EMPTY = 0;
    public static final int SHIP = 1;
    public static final int DEAD = 2;
    public static final int MISS = 3;
    public static final int MAX_COUNT = 10;
    public static final int TRY = 30;

    public static void main(String[] args) {

        int[][] warField = new int[SIZE][SIZE];

        Random random = new Random();

        for (int i = 0; i < MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shopPlace2 = random.nextInt(SIZE);

            if (warField[shipPlace1][shopPlace2] == SHIP) {
                i--;
            }

            warField[shipPlace1][shopPlace2] = SHIP;
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print((warField[i][j]) + " ");
            }
            System.out.println();
        }

        for (int i = TRY; i > 0; i--) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введете координаты для атаки " + "(осталось " + i + " попыток)");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;

            if (warField[x][y] == EMPTY) {
                System.out.println("Промах");
                warField[x][y] = MISS;
                if (i == 1) {
                    System.out.println("Вы проиграли");
                    return;
                }
            }

            if (warField[x][y] == SHIP) {
                System.out.println("Корабль застрелен" );
                warField[x][y] = DEAD;

                boolean userWon = isUserWon(warField);
                if (userWon) {
                    return;
                }

            }

            for (int k = 0; k < SIZE; k++) {
                for (int s = 0; s < SIZE; s++) {
                    System.out.print((warField[k][s]) + " ");
                }
                System.out.println();
            }
        }

    }

    private static boolean isUserWon(int[][] warField) {
        boolean isWon = false;
        int shipCount = 0;
        int k = 0;
        while (k < SIZE) {
            int j = 0;
            while (j < SIZE) {
                if (warField[k][j] == SHIP) {
                    shipCount++;
                }
                j++;
            }
            k++;
        }
        if (shipCount == 0) {
            isWon = true;
        }
        if (!isWon) {
            System.out.println("Играем Дальше");
        } else {
            System.out.println("Вы победили");
        }
        return isWon;
    }


}


