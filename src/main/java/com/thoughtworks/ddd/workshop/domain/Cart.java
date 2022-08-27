package com.thoughtworks.ddd.workshop.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cart {

  private List<Item> items;

  private Set<String> deletedProducts;

  private boolean isCheckedOut;

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

  public Order checkout() {
    if(isCheckedOut) {
      //TODO return existing order
      return null;
    }
    isCheckedOut = true;
    //create Order
    List<Product> products = new ArrayList<>();
    items.forEach(item -> {
      for(int i=1; i<=item.getQuantity(); i++) {
        products.add(item.getProduct());
      }
    });
    return new Order(products);
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }
}
