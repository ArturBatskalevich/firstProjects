package ru.netology.homework4.Ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = "";
        String output = "";


        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                int a = Integer.parseInt(input, 8);
                char c = (char) a;
                output = output + c;
            }
        }
        System.out.println("Результат: " + output);
        }

    }

