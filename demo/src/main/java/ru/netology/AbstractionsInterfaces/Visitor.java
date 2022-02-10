package ru.netology.AbstractionsInterfaces;

public class Visitor implements Supplier,Client {

    private String name;
    private String product;

    public Visitor(String name, String product) {
        this.name = name;
        this.product = product;
    }

    public void payAHaircut(int coast) {
        System.out.println("Заплатил " + coast + " р за стражку");
    }

    public void checks(String product) {
        if (product.equals("NAK")) {
            System.out.println("Товар есть");
        } else {
            System.out.println("Товар отсутствует");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}


