package ru.git.Trading.product;

import static java.lang.String.format;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(){
        name = "Default";
        price = 0.0;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        //"name: "+ name + ", price: " + price + "р".
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format("%-15s%-15s", name, price+"р"));
        return stringBuilder.toString();
    }
}
