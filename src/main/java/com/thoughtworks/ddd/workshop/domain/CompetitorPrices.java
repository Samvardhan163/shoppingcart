package com.thoughtworks.ddd.workshop.domain;

import java.util.HashMap;
import java.util.Map;

public class CompetitorPrices {

    public static Map<String, Price> pricing;

    static {
        pricing = new HashMap<>();
        pricing.put("Ipad Pro 2", new Price(150));
        pricing.put("Apple Pencil 2", new Price(120));
    }

}
