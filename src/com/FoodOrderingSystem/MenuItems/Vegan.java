package com.FoodOrderingSystem.MenuItems;

public class Vegan extends Pizza{
    private double price = 15.0;
    public Vegan(Size size, Crust crust) {
        super(size, crust);
        setPrice(price);
    }

    @Override
    public double getPrice() {
        return price + super.getCountOfToppings();
    }

    @Override
    public void setPrice(double price) {
        if(getSize().equals(Size.Medium)){
            this.price = price * 2;
        }
        else if(getSize().equals(Size.Large)){
            this.price = price * 3;
        }
        else{
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Flavour" + " Vegan";
    }
}
