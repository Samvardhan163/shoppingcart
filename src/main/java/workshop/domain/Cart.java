package com.thoughtworks.ddd.workshop.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cart {

  private List<Item> items;

  private Set<String> deletedProducts;

  public Cart() {
    this.items = new ArrayList<>();
    this.deletedProducts = new HashSet<>();
  }

  public void add(Product product, int quantity) {
    items.add(new Item(product, quantity));
  }

  public void show() {
    System.out.println("Items in cart:");
    items.forEach(System.out::println);
  }

  public void remove(Product product) {
    items = items.stream().filter(item -> !item.getProduct().getName().equals(product.getName()))
        .collect(Collectors.toList());
    deletedProducts.add(product.getName());
  }

  public Set<String> getDeletedProducts() {
    return deletedProducts;
  }

  public boolean equals(Cart anotherCart) {
    return this == anotherCart;
  }

}
