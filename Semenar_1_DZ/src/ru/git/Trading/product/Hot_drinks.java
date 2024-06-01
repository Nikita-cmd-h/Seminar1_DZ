package ru.git.Trading.product;

import static java.lang.String.format;

public class Hot_drinks extends Buttle{
    private int temperature;

    public Hot_drinks(String name, double price, double volume, int temperature){
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format("%-15s", temperature));
        return super.toString() + stringBuilder.toString();
    }
}
