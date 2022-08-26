package org.example;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Item ipadPro = new Item("Ipad pro");
        cart.add(ipadPro,1);
        Item heroPen = new Item("Hero ink Pen");
        cart.add(heroPen,1);
        Item gmCricketBat = new Item("GM Cricket bat");
        cart.add(gmCricketBat,2);
        cart.show();
    }
}