package com.thoughtworks.ddd.workshop;

import com.thoughtworks.ddd.workshop.domain.Cart;
import com.thoughtworks.ddd.workshop.domain.Price;
import com.thoughtworks.ddd.workshop.domain.Product;

public class PlacingOrder {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product iPadPro2 = new Product("Ipad Pro 2", new Price(15));
        cart.add(iPadPro2, 2);
        cart.checkout();
    }
}
