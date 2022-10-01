package com.FoodOrderingSystem.MenuItems;

public class Pasta implements ItalianFood{
    private TypeOfPasta pastaType;
    private double price;

    public Pasta(TypeOfPasta pastaType) {
        this.pastaType = pastaType;
    }

    public TypeOfPasta getPastaType() {
        return pastaType;
    }

    public void setPastaType(TypeOfPasta pastaType) {
        this.pastaType = pastaType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pasta "+ " "+ pastaType;
    }
}
