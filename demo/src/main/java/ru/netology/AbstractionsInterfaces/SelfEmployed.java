package ru.netology.AbstractionsInterfaces;

class SelfEmployed implements Administrator,Barber,Client {

    private String name;

    public SelfEmployed(String name){
        this.name = name;
    }

    public void calculate(){
        System.out.println("Клиент расчитался");
    }

    public void bookAClient(){
        System.out.println("Клиента записал");
    }

    public void payASalary(){
        System.out.println("Зарплату забрал");

    }

    public void cut(){
        System.out.println("Подстриг");
    }

    public void payAHaircut(int coast){
        System.out.println("Заплатил " +  coast +  " р за стражку");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
