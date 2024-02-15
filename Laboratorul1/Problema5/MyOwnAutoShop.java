package Problema5;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(60, 20000, "Red", 25);
        Ford ford1 = new Ford(70, 25000, "Blue", 2010, 1000);
        Ford ford2 = new Ford(65, 23000, "Green", 2015, 1500);
        Car car = new Car(80, 30000, "Black");

        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: $" + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: $" + ford2.getSalePrice());
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}

