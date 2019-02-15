package com.codesmell.featureenvy.good;

//https://refactoring.guru/smells/feature-envy
//https://sourcemaking.com/refactoring/smells/feature-envy
public class BasketMoveMethod {

    public static void main(String[] args) {
        Item item = new Item(10, 0.2,
                0.3, false);
        double totalPrice = item.getTotalPrice();
        System.out.println(totalPrice);
    }
}

class Item {

    private final double price;
    private final double tax;
    private final double saleDiscount;
    private final boolean onSale;

    Item(double price, double tax, double saleDiscount, boolean onSale) {
        this.price = price;
        this.tax = tax;
        this.saleDiscount = saleDiscount;
        this.onSale = onSale;
    }

    double getTotalPrice() {
        double taxedPrice = this.price + tax;
        if (onSale) {
            taxedPrice = taxedPrice - saleDiscount * taxedPrice;
        }
        return taxedPrice;
    }
}
