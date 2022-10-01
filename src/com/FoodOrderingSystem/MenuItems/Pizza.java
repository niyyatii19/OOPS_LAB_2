package com.FoodOrderingSystem.MenuItems;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements ItalianFood{
    private Size size;
    private Crust crust;
    private List<Toppings> toppings;
    private double price;

    public Pizza(Size size, Crust crust) {
        this.size = size;
        this.crust = crust;
        toppings = new ArrayList<>();
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public void addToppings(Toppings toppings){
        this.toppings.add(toppings);
    }
    public int getCountOfToppings(){
        return this.toppings.size();
    }

    public String showToppings(){
        return toppings.toString() + "added in pizza";
    }
    @Override
    public double getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Pizza "+ size + " "+ crust + " "+ toppings;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
