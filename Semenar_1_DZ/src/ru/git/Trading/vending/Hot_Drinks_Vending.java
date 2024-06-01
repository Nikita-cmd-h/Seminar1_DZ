package ru.git.Trading.vending;

import ru.git.Trading.product.Buttle;
import ru.git.Trading.product.Hot_drinks;
import ru.git.Trading.product.Product;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Hot_Drinks_Vending implements Vending_machine{
    private List<Product> productList;

    public Hot_Drinks_Vending() {
        productList = new ArrayList<>();
    }

    public void addProduct(Hot_drinks product){
        productList.add(product);
    }

    @Override
    public String search(String filter, String nameProduct) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Поиск по фильтру: "+filter+"\nКритерий поиска: "+nameProduct+"\n");
        stringBuilder.append(format("%-15s%-15s%-15s%-15s%n", "Name", "Price", "Volume", "Temperature"));
        boolean found = false;
        for(Product product : productList){
            if(filter == Filter.Name.toString()) {
                if (product.getName() == nameProduct) {
                    stringBuilder.append(product + "\n");
                    found = true;
                }
            }else if(filter == Filter.Price.toString()){
                if (product.getPrice() == Integer.parseInt(nameProduct)) {
                    stringBuilder.append(product + "\n");
                    found = true;
                }
            }
        }
        if(found) {
            return stringBuilder.toString();
        }else {
            return stringBuilder.append(format("%-15s%-15s%-15s%-15s%n", "none", "none", "none", "none")).toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format("%-15s%-15s%-15s%-15s%n", "Name", "Price", "Volume", "Temperature"));

        for (Product product: productList) {
            stringBuilder.append(product+"\n");
        }
        return stringBuilder.toString();
    }
}
