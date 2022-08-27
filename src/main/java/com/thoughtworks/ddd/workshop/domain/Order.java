package com.thoughtworks.ddd.workshop.domain;

import java.util.List;

public class Order {

    private List<Product> products;


    public Order(List<Product> products) {
        this.products = products;
    }

    public float totalCost() {
        float totalCost = 0f;
        for(int i=0; i<products.size(); i++) {
            final Product product = products.get(i);
            totalCost += product.getPrice().getValue() + product.getWeight().getValue()*0.1;
        }
        return totalCost;
    }
}
