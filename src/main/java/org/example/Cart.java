package org.example;

import java.util.HashMap;

public class Cart {
    private HashMap<Item, Integer> lineItem = new HashMap<>();

    public Cart() {
        this.lineItem = new HashMap<>();
    }

    public  void add(Item item,int quantity) {
        lineItem.put(item,quantity);
    }

    public void show()
    {
        lineItem.forEach((item, quantity) -> System.out.println(item.getName()));
    }
}

