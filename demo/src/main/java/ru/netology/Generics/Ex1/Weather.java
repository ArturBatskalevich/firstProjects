package ru.netology.Generics.Ex1;

public class Weather<K,T> {

    private K today;
    private T tomorrow;


    public Weather(K today,T tomorrow) {
        this.today = today;
        this.tomorrow = tomorrow;

    }

    public K getToday() {
        return today;
    }

    public void setToday(K today) {
        this.today = today;
    }

    public T getTomorrow() {
        return tomorrow;
    }

    public void setTomorrow(T tomorrow) {
        this.tomorrow = tomorrow;
    }

    @Override
    public String toString() {
        return "Weather { " +
                "Today = " + today +
                ", Tomorrow = " + tomorrow + '}';
    }
}
