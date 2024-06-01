package ru.git.Trading.product;

import static java.lang.String.format;

public class Buttle extends Product{

    private double volume;

    public Buttle(String name, double price, double volume){
        super(name, price);
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format("%-15s", volume+"л"));
        return super.toString() + stringBuilder.toString();
    }
}
