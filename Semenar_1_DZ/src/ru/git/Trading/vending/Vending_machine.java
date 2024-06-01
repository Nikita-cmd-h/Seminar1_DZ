package ru.git.Trading.vending;

import ru.git.Trading.product.Hot_drinks;

import java.util.Objects;

public interface Vending_machine {
    public String search(String filter, String nameProduct);
    public String toString();

}
