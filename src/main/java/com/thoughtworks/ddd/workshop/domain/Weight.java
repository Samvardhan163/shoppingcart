package com.thoughtworks.ddd.workshop.domain;

public class Weight {

    int value;
    String unit = "gms";

    public Weight(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Weight(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
