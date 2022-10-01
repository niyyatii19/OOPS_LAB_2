package com.FoodOrderingSystem.CustomerData;

import com.FoodOrderingSystem.MenuItems.Pizza;
import com.FoodOrderingSystem.MenuItems.Toppings;
import com.FoodOrderingSystem.MenuItems.TypeOfPasta;

public class Menu {

    public void getMenu(){
        System.out.println("1. Pizza");
        System.out.println("            " + "\t" + "Small" + "\tMedium" + "\tLarge");
        System.out.println("1. Vegetarian Pizza "+ "\t"+ "$20" + "\t$40" + "\t$60");
        System.out.println("2. Non Vegetarian Pizza "+ "\t"+ "$25" + "\t$50" + "\t$75");
        System.out.println("3. Vegan Pizza     "+ "\t"+ "$15" + "\t$30" + "\t$45");
        System.out.println("Extra Toppings to add $1 each");
        System.out.println(Toppings.Cheese);
        System.out.println(Toppings.Mushroom);
        System.out.println(Toppings.Jalapeno);
        System.out.println(Toppings.Spinach);
        System.out.println(Toppings.Tomato);


        System.out.println("2. Pasta");
        System.out.println("Two flavours present");
        System.out.println("1. White Sauce Pasta "+ " $10");
        System.out.println("2. Red Sauce Pasta "+ " $20");
        System.out.println("Two types");
        System.out.println(TypeOfPasta.Penne.toString() + "\n"
                +TypeOfPasta.Ditalini.toString());
    }



}
