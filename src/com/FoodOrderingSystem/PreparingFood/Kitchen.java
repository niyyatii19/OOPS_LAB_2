package com.FoodOrderingSystem.PreparingFood;

import com.FoodOrderingSystem.CustomerData.OrderingRequest;
import com.FoodOrderingSystem.CustomerData.PastaOrder;
import com.FoodOrderingSystem.CustomerData.PizzaOrder;
import com.FoodOrderingSystem.MenuItems.*;
import com.FoodOrderingSystem.Notifications.NotificationSystem;

import java.util.List;
import java.util.Queue;

public class Kitchen {
    NotificationSystem notificationSystem;
    Pizza pizza;
    Pasta pasta;

    public void prepareOrder(List<OrderingRequest> orderingRequestList, int tableNo) {
        for (OrderingRequest orderingRequest : orderingRequestList) {
            if (orderingRequest.getPastaOrder() != null) {
                for(int i =0; i<orderingRequest.getPastaOrder().getQuantity(); i++){
                    makePasta(orderingRequest.getPastaOrder());
                }
                notificationSystem.foodIsReady(pasta, orderingRequest.getPastaOrder().getQuantity());
            }
            if (orderingRequest.getPizzaOrder() != null) {
//                //System.out.println(orderingRequest.getPizzaOrder().toString() + " "+
//                        orderingRequest.getPizzaOrder().getQuantity());
                for(int i =0; i<orderingRequest.getPizzaOrder().getQuantity(); i++){
                    makePizza(orderingRequest.getPizzaOrder());
                }
                notificationSystem.foodIsReady(pizza, orderingRequest.getPizzaOrder().getQuantity());
            }
        }
    }

    private void makePizza(PizzaOrder pizzaOrder) {
        //System.out.println(pizzaOrder.getPizzaFlavour());
        if(pizzaOrder.getPizzaFlavour().compareTo(PizzaFlavour.NonVeg) == 0){
            this.pizza = new NonVeg(pizzaOrder.getSize(), pizzaOrder.getCrust());
            if(pizzaOrder.getToppingsList().size() != 0){
                this.pizza.setToppings(pizzaOrder.getToppingsList());
            }
        }
        else if(pizzaOrder.getPizzaFlavour().equals(PizzaFlavour.Veg)){
            this.pizza = new Veg(pizzaOrder.getSize(), pizzaOrder.getCrust());
            if(pizzaOrder.getToppingsList().size() != 0){
                this.pizza.setToppings(pizzaOrder.getToppingsList());
            }
        }
        else{
            this.pizza = new Vegan(pizzaOrder.getSize(), pizzaOrder.getCrust());
            if(pizzaOrder.getToppingsList().size() != 0){
                this.pizza.setToppings(pizzaOrder.getToppingsList());
            }
        }

    }

    private void makePasta(PastaOrder pastaOrder) {

        if(pastaOrder.getPastaFlavour().equals(PastaFlavour.WhiteSauce)){
            pasta = new WhiteSaucePasta(pastaOrder.getTypeOfPasta());

        }else{
            pasta = new RedSaucePasta(pastaOrder.getTypeOfPasta());
        }
    }

    public NotificationSystem getNotificationSystem() {
        return notificationSystem;
    }

    public void setNotificationSystem(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }
}
