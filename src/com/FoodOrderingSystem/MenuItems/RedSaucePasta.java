package com.FoodOrderingSystem.MenuItems;

public class RedSaucePasta extends Pasta{
    private double price = 20;
    public RedSaucePasta(TypeOfPasta pastaType) {
        super(pastaType);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " with Red Sauce";
    }
}
