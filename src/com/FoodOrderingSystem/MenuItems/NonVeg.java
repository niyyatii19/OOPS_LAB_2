package com.FoodOrderingSystem.MenuItems;

public class NonVeg extends Pizza{
    private double price = 25.0;
    public NonVeg(Size size, Crust crust) {
        super(size, crust);
        setPrice(this.price);
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
        return super.toString() + " Flavour " + "Non Veg";
    }
}
