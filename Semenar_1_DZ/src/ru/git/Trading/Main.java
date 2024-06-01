package ru.git.Trading;

import ru.git.Trading.product.Buttle;
import ru.git.Trading.product.Hot_drinks;
import ru.git.Trading.product.Product;
import ru.git.Trading.vending.Buttle_Vending;
import ru.git.Trading.vending.Filter;
import ru.git.Trading.vending.Hot_Drinks_Vending;
import ru.git.Trading.vending.Trading_Automation;

public class Main {
    public static void main(String[] args){
        Trading_Automation tradingAutomation = new Trading_Automation();
        Hot_Drinks_Vending hotDrinksVending = new Hot_Drinks_Vending();
        Buttle_Vending buttleVending = new Buttle_Vending();


        Product charging1 = new Product("Сыр", 200);
        Product charging2 = new Product("Мясо", 110);
        Product charging3 = new Product("Хлеб", 90);

        Buttle charging4 = new Buttle("Coca-Cola", 100, 0.33);
        Buttle charging5 = new Buttle("Fanta", 200, 1);
        Buttle charging6 = new Buttle("Fanta", 99, 0.33);

        Hot_drinks charging7 = new Hot_drinks("Green tea", 79.99, 0.33, 100);


        tradingAutomation.addProduct(charging1);
        tradingAutomation.addProduct(charging2);
        tradingAutomation.addProduct(charging3);
        tradingAutomation.addProduct(charging4);
        tradingAutomation.addProduct(charging5);
        tradingAutomation.addProduct(charging6);
        tradingAutomation.addProduct(charging7);

        buttleVending.addProduct(charging4);
        buttleVending.addProduct(charging5);
        buttleVending.addProduct(charging6);

        hotDrinksVending.addProduct(charging7);


        //Вывести всё
        System.out.println(tradingAutomation);
        System.out.println();
        //Фильтер по цене
        System.out.println(tradingAutomation.search(Filter.Price.toString(),"200"));
        System.out.println();
        //Фильтер по названию
        System.out.println(tradingAutomation.search(Filter.Name.toString(),"Fanta"));
        System.out.println();
        //Вывести все напитки
        System.out.println(buttleVending);
        System.out.println();
        //Вывести все горячие напитки
        System.out.println(hotDrinksVending);
    }
}