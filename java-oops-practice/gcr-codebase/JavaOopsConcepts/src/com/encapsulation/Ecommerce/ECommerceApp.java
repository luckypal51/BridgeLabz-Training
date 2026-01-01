package com.encapsulation.Ecommerce;

import java.util.ArrayList;

public class ECommerceApp {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        PriceCalculator.printFinalPrices(products);
    }
}
