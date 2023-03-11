package com.company;

public class Main {

    public static void main(String[] args) {

        Product a = new Product(new SummerDiscount(), 25);
        System.out.println(a.getDiscountPrice());

        a.setDiscount(new WinterDiscount());
        System.out.println(a.getDiscountPrice());
    }
}
