package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public  void add(Item item) {
        items.add(item);
    }

    public void show()
    {
        items.forEach(item -> System.out.println(item.getName()));
    }
}

