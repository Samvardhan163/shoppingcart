package com.thoughtworks.ddd.workshop;

import com.thoughtworks.ddd.workshop.domain.Cart;
import com.thoughtworks.ddd.workshop.domain.Price;
import com.thoughtworks.ddd.workshop.domain.Product;
import com.thoughtworks.ddd.workshop.domain.domain_service.PricingCalculator;

public class DiscountExample {

    public static void main(String[] args) {

        Cart cart = new Cart();
        PricingCalculator pricingCalculator = new PricingCalculator();

        Price discountedPrice = pricingCalculator.getDiscountedPrice("Ipad Pro 2", 0.1f);

        Product iPadPro2 = new Product("Ipad Pro 2", discountedPrice);

        cart.add(iPadPro2, 1);
        cart.show();
    }
}
