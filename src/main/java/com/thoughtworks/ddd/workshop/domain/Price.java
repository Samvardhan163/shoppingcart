package com.thoughtworks.ddd.workshop.domain;

import java.util.Currency;

public class Price {

  private final Currency currency;

  private float value;

  public Currency getCurrency() {
    return currency;
  }

  public float getValue() {
    return value;
  }

  public Price(float value) {
    this.value = value;
    this.currency = Currency.getInstance("USD");
  }

  @Override
  public String toString() {
    return "Price: " + value + currency;
  }

  public Price getDiscountedPrice() {
    return new Price(this.value - (this.value / 10));
  }

  public Price reduceBy(float amount) {
    return new Price (this.value - amount);
  }
}
