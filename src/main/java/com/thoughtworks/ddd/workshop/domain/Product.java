package com.thoughtworks.ddd.workshop.domain;

public class Product {

  private String name;

  private Price price;

  private Weight weight;

  public String getName() {
    return name;
  }

  public Price getPrice() {
    return price;
  }

  public Weight getWeight() {
    return weight;
  }

  public Product(String name, Price price) {
    this.name = name;
    this.price = price;
  }

  public Product(String name, Price price, Weight weight) {
    this.name = name;
    this.price = price;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return  "Name: " + name + " Price:" + price;
  }
}
