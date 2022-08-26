package com.thoughtworks.ddd.workshop.domain;

public class Product {

  private String name;

  private Price price;

  public String getName() {
    return name;
  }

  public Product(String name, Price price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return  "Name: " + name + " Price:" + price;
  }
}
