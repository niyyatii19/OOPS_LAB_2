package com.FoodOrderingSystem.CustomerData;

import com.FoodOrderingSystem.MenuItems.Crust;
import com.FoodOrderingSystem.MenuItems.PizzaFlavour;
import com.FoodOrderingSystem.MenuItems.Size;
import com.FoodOrderingSystem.MenuItems.Toppings;

import java.util.List;

public class PizzaOrder {
    private PizzaFlavour pizzaFlavour;
    private Crust crust;
    private Size size;
    private List<Toppings> toppingsList;
    private int quantity;

    public PizzaOrder(PizzaFlavour pizzaFlavour, Crust crust, Size size, List<Toppings> toppingsList, int quantity) {
        this.pizzaFlavour = pizzaFlavour;
        this.crust = crust;
        this.size = size;
        this.toppingsList = toppingsList;
        this.quantity = quantity;
    }

    public PizzaFlavour getPizzaFlavour() {
        return pizzaFlavour;
    }

    public void setPizzaFlavour(PizzaFlavour pizzaFlavour) {
        this.pizzaFlavour = pizzaFlavour;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<Toppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nPizzaOrder: {" +
                "pizzaFlavour =" + pizzaFlavour +
                ", crust =" + crust +
                ", size =" + size +
                ", toppingsList =" + toppingsList +
                ", quantity =" + quantity +
                '}';
    }
}
