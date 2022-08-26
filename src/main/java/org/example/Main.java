package org.example;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Item ipadPro = new Item("Ipad pro");
        cart.add(ipadPro);
        Item heroPen = new Item("Hero ink Pen");
        cart.add(heroPen);
        cart.show();
    }
}