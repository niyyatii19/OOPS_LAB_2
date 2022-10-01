package com.FoodOrderingSystem.MenuItems;

public class WhiteSaucePasta extends Pasta{
    private double price = 10;
    public WhiteSaucePasta(TypeOfPasta pastaType) {
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
        return super.toString() + " with White Sauce";
    }
}
