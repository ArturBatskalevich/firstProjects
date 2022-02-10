package ru.netology.AbstractionsInterfaces;

public class Main {
    public static void main(String[] args){

        SelfEmployed danik = new SelfEmployed("Danik");
        SelfEmployed alex = new SelfEmployed("Alex");
        Visitor klaustrofobiya = new Visitor("Пинский", "Reuzel");
        Visitor vova = new Visitor("Брестский", "NAK");


        System.out.println("Самозанятый " +  danik.getName());

        danik.bookAClient();
        danik.cut();
        danik.calculate();
        danik.payASalary();
        danik.payAHaircut(35);
        System.out.println("");

        System.out.println("Самозанятый " + alex.getName());
        alex.cut();
        alex.calculate();
        alex.payASalary();

        System.out.println("");

        System.out.println(klaustrofobiya.getName());
        klaustrofobiya.checks(klaustrofobiya.getProduct());

        System.out.println(vova.getName());
        vova.checks(vova.getProduct());




    }
}
