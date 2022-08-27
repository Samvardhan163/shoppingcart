package com.thoughtworks.ddd.workshop;

import com.thoughtworks.ddd.workshop.domain.Cart;
import com.thoughtworks.ddd.workshop.domain.Price;
import com.thoughtworks.ddd.workshop.domain.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {

  public static void main(String[] args) {
    Cart cart = new Cart();

    Product iPadPro = new Product("Ipad Pro", new Price(10));
    cart.add(iPadPro, 1);

    Product heroInkPen = new Product("Hero ink Pen", new Price(15));
    cart.add(heroInkPen, 1);

    Product gmBat = new Product("GM Cricket bat", new Price(12));
    cart.add(gmBat, 2);

    Product applePencil = new Product("Apple Pencil", new Price(20));
    cart.add(applePencil, 2);
    cart.show();

    cart.remove(applePencil);

    cart.show();

    cart.remove(heroInkPen);

    Set<String> deletedProducts = cart.getDeletedProducts();

    System.out.println("Products deletes:");
    deletedProducts.forEach(System.out::println);

    Cart cart1 = new Cart();
    cart1.add(heroInkPen, 1);
    cart.add(gmBat, 2);

    Cart cart2 = new Cart();
    cart2.add(heroInkPen, 1);
    cart.add(gmBat, 2);

    System.out.println("------------ Cart comparision ------------");
    System.out.println("Cart 1 & 2: " + cart1.equals(cart2));
    System.out.println("Cart 2 & 1: " + cart2.equals(cart1));
    System.out.println("Cart 1 & 1: " + cart1.equals(cart1));
    System.out.println("Cart 2 & 2: " + cart2.equals(cart2));
  }

}
