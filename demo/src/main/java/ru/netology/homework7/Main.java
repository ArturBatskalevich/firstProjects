package ru.netology.homework7;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double sumProducts = 0;
        String[] products = new String[]{"Молоко", "Хлеб", "Гречневая крупа"};
        double[] prices = new double[]{1.8, 1.5, 2.3};
        String space = "    ";
        String bigSpace = "             ";

        int[] productsNumber = new int[]{0, 0, 0};
        double[] totalCostOfProduct = new double[]{0, 0, 0};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Список возможных товаров для покупки: " + Arrays.toString(products));
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + " " + products[i] + " - цена за 1 шт. " + prices[i] + "р.");
        }

        while (true) {

            System.out.println("Выберите товар и количество или введите `end`");

            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");

            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);


            for (int i = 0; i <= products.length - 1; i++) {
                if (productNumber == i) {
                    productsNumber[i] = productsNumber[i] + productCount;
                    totalCostOfProduct[i] = productsNumber[i] * prices[productNumber];
                }
            }

            sumProducts = Arrays.stream(totalCostOfProduct).sum();

        }
        System.out.println("Ваша корзина:");
        System.out.println("Наименование" + space + "Количество" + space + "Цена/за ед." + space + "Общая стоимость");

        for (int i = 0; i <= products.length - 1; i++) {

            if (totalCostOfProduct[i] != 0) {
                System.out.println(products[i] + bigSpace + productsNumber[i] + bigSpace + prices[i] + bigSpace + productsNumber[i] * prices[i]);
            }
        }
        System.out.println(bigSpace + bigSpace + space + "ИТОГО:" + bigSpace + sumProducts);
    }
}
