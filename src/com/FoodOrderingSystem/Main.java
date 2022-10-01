package com.FoodOrderingSystem;

import com.FoodOrderingSystem.CustomerData.*;
import com.FoodOrderingSystem.MenuItems.*;
import com.FoodOrderingSystem.Notifications.NotificationSystem;
import com.FoodOrderingSystem.PreparingFood.Kitchen;
import com.FoodOrderingSystem.PreparingFood.OrderingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static CustomerDetails customerDetails = new CustomerDetails("XYZ", 18);
    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu();
        menu.getMenu();

        int option;
        do{
            System.out.println("Enter your Order either option 1 Pizza or 2 Pasta "+ "\n"+
                    "Any other number to quit");
            option = scan.nextInt();
            takeOrder(option);
        }while(option != 3);

        NotificationSystem notificationSystem = new NotificationSystem();
        OrderingSystem orderingSystem = new OrderingSystem();
        Kitchen kitchen = new Kitchen();
        kitchen.setNotificationSystem(notificationSystem);
        orderingSystem.setCustomerDetails(customerDetails);
        notificationSystem.setOrderingSystem(orderingSystem);
        notificationSystem.setCustomerDetails(customerDetails);
        notificationSystem.setKitchen(kitchen);

        notificationSystem.takeTheOrderList();
        System.out.println("Your Bill: ");
        System.out.println(orderingSystem.orderSummary());
        System.out.println("Enter your Payment Mode: Debit, Credit, Cash");
        String payment = scan.next();
        Payment payment1;
        if(payment.equals("Debit")){
            payment1 = new DebitCard();
        }
        else if(payment.equals("Credit")){
            payment1 = new CreditCard();
        }else{
            payment1 = new CashPayment();
        }
        payment1.setMakePayment(true);
        customerDetails.setPayment(payment1);

        System.out.println("Thanks for visiting");
    }

    public static void takeOrder(int options){
        switch (options){
            case 1:{
                System.out.println("1. You have selected for Pizza");
                System.out.println("Please select flavour of the  Veg, NonVeg, Vegan");
                String flavour = scan.next();
                System.out.println("Enter Size Small, Medium, Large");
                String size = scan.next();
                System.out.println("Enter Crust Thick, Thin");
                String crust = scan.next();
                System.out.println("Want to add any extra toppings? Yes or No ");
                String addTopping = scan.next();
                List<Toppings> toppings = new ArrayList<>();
                if(addTopping.equals("Yes")){
                    System.out.println("How many? ");
                    int num = scan.nextInt();
                    System.out.println("Add your toppings as per the menu");
                    for(int i=0; i<num; i++){
                        String topping = scan.next();
                        toppings.add(Toppings.valueOf(topping));
                    }
                }
                System.out.println("How much Servings?");
                int quantity = scan.nextInt();
                OrderingRequest orderingRequest = new OrderingRequest();
                PizzaOrder pizzaOrder = new PizzaOrder(PizzaFlavour.valueOf(flavour),Crust.valueOf(crust),
                        Size.valueOf(size), toppings, quantity);
                orderingRequest.setPizzaOrder(pizzaOrder);
                customerDetails.addOrder(orderingRequest);
                break;
            }
            case 2:{
                System.out.println("2. You have selected for pasta");
                System.out.println("Please select flavour WhiteSauce, RedSauce");
                String flavour = scan.next();
                System.out.println("Enter type of pasta Penne, Ditalini");
                String typeOfPasta = scan.next();
                System.out.println("How much Servings?");
                int quantity = scan.nextInt();
                OrderingRequest orderingRequest = new OrderingRequest();
                PastaOrder pastaOrder = new PastaOrder(PastaFlavour.valueOf(flavour), TypeOfPasta.valueOf(typeOfPasta), quantity);
                orderingRequest.setPastaOrder(pastaOrder);
                customerDetails.addOrder(orderingRequest);
                break;
            }
            default:
                break;
        }
    }


}
