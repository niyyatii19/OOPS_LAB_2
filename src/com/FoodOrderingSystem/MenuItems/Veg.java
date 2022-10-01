package com.FoodOrderingSystem.MenuItems;

public class Veg extends Pizza{
    private double price = 20;
    public Veg(Size size, Crust crust) {
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
        return super.toString() + " Flavour" + " Veg";
    }
}
