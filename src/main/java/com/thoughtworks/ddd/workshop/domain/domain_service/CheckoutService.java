package com.thoughtworks.ddd.workshop.domain.domain_service;

import com.thoughtworks.ddd.workshop.domain.Order;

public class CheckoutService {

    public Order checkout() {
        //Create order -> get the list of products from Cart
        //Checkout cart
        return new Order(null);
    }
}
