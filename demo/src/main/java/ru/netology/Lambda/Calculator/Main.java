package ru.netology.Lambda.Calculator;

import ru.netology.Lambda.Calculator.Calculator;

public class Main {
    public static void main(String[] args){

        Calculator calculator = Calculator.instance.get(); //  Calculator calculator = new Calculator();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        int c = calculator.devide.apply(a, b);  // Ошибка, на ноль ещё не предусмотрели в выражещии.

        System.out.println(c);


    }
}
