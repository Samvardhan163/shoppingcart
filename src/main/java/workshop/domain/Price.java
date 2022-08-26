package com.thoughtworks.ddd.workshop.domain;

import java.util.Currency;

public class Price {

  private final Currency currency;

  private float value;

  public Price(float value) {
    this.value = value;
    this.currency = Currency.getInstance("USD");
  }

  @Override
  public String toString() {
    return "Price: " + value + currency;
  }
}
