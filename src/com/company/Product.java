package com.company;

interface Discount{
    float applyDiscount(float price);
}

class SummerDiscount implements Discount{


    @Override
    public float applyDiscount(float price) {
        System.out.println("Summer Discount 20%");
        return price*8/10;
    }
}

class WinterDiscount implements Discount{

    @Override
    public float applyDiscount(float price) {
        System.out.println("Winter Discount 10%");
        return price*9/10;
    }
}


public class Product {
    private Discount discount;
    private float price;

    public Product(Discount discount, float price) {
        this.discount = discount;
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscountPrice(){
        return discount.applyDiscount(price);
    }
}
