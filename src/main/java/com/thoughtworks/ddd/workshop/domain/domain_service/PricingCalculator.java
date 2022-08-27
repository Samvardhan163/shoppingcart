package com.thoughtworks.ddd.workshop.domain.domain_service;

import com.thoughtworks.ddd.workshop.domain.CompetitorPrices;
import com.thoughtworks.ddd.workshop.domain.Price;

public class PricingCalculator {

    public Price getDiscountedPrice(String productName, float discountPercent) {
        Price competitorPrice = CompetitorPrices.pricing.get(productName);
        float discountPrice = competitorPrice.getValue() * discountPercent;
        return competitorPrice.reduceBy(discountPrice);
    }
}
