package com.FoodOrderingSystem.Notifications;

import com.FoodOrderingSystem.CustomerData.CustomerDetails;
import com.FoodOrderingSystem.CustomerData.OrderingRequest;
import com.FoodOrderingSystem.MenuItems.ItalianFood;
import com.FoodOrderingSystem.PreparingFood.Kitchen;
import com.FoodOrderingSystem.PreparingFood.OrderingSystem;

import java.util.Queue;

public class NotificationSystem {
    CustomerDetails customerDetails;
    OrderingSystem orderingSystem;
    Kitchen kitchen;

    public void takeTheOrderList(){

        kitchen.prepareOrder(customerDetails.getOrderingRequests(), customerDetails.getTableNo());
    }
    public void foodIsReady(ItalianFood food, int quantity) {
        orderingSystem.serveFood(food, customerDetails.getTableNo(), quantity);
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public OrderingSystem getOrderingSystem() {
        return orderingSystem;
    }

    public void setOrderingSystem(OrderingSystem orderingSystem) {
        this.orderingSystem = orderingSystem;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
