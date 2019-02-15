package com.codesmell.featureenvy.bad;

//https://help.semmle.com/wiki/display/JAVA/Feature+envy
public class BasketBad {

    private double getTotalPrice(Item item) {
        double price = item.getPrice() + item.getTax();
        if (item.isOnSale()) {
            price = price - item.getSaleDiscount() * price;
        }
        return price;
    }

    public static void main(String[] args) {
        Item item = new Item(10, 0.2, 0.3, false);
        System.out.println(new BasketBad().getTotalPrice(item));
    }
}

class Item {

    private final double price;
    private final double tax;
    private final double saleDiscount;
    private final boolean onSale;

    double getPrice() {
        return price;
    }

    double getTax() {
        return tax;
    }

    boolean isOnSale() {
        return onSale;
    }

    double getSaleDiscount() {
        return saleDiscount;
    }

    Item(double price, double tax, double saleDiscount, boolean onSale) {
        this.price = price;
        this.tax = tax;
        this.saleDiscount = saleDiscount;
        this.onSale = onSale;
    }
}
