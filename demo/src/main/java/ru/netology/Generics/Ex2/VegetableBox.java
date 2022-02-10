package ru.netology.Generics.Ex2;

public class VegetableBox<T, K extends Vegetable> {

    private T key;
    private K obj;

    public VegetableBox(T key, K obj) {
        this.key = key;
        this.obj = obj;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getObj() {
        return obj;
    }

    public void setObj(K obj) {
        this.obj = obj;
    }
}

