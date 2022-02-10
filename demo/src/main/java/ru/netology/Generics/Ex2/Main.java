package ru.netology.Generics.Ex2;

public class Main {
    public static void main(String a[]) {
            Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
            bananaBox.getObj().printClass();

            Box<String, Apple> appleBox = new Box<>("apple", new Apple());
            appleBox.getObj().printClass();

            Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
            fruitBox.getObj().printClass();

            //Мы не можем положить в коробку Cabbage, т.к. этот Class не является наследником Fruit
            VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
            cabbageBox.getObj().printClass();
        }
}

