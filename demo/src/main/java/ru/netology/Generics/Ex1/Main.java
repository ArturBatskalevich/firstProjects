package ru.netology.Generics.Ex1;

public class Main {

    public static void main(String[] args) {

       Weather<String,String> simple1 = new Weather<>("Переменная облачность", "Дождь");
       System.out.println(simple1);

        Weather<Double,Double> simple2 = new Weather<>(13.6, 12.2);
        System.out.println(simple2);

       Weather<Character,Character> simple3 = new Weather<>('\u2601','\u2614');
       System.out.println(simple3);



    }
}
