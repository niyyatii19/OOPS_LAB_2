package com.FoodOrderingSystem.PreparingFood;

import com.FoodOrderingSystem.CustomerData.CustomerDetails;
import com.FoodOrderingSystem.CustomerData.OrderingRequest;
import com.FoodOrderingSystem.MenuItems.ItalianFood;
import com.FoodOrderingSystem.MenuItems.Pizza;

public class OrderingSystem {
    CustomerDetails customerDetails;
    double totalPrice;

    public void serveFood(ItalianFood food, int tableNo, int quantity) {
        this.totalPrice += quantity *food.getPrice();
        System.out.println("Serve food "+ food.toString() + " at table No."+ tableNo);
    }

    public String orderSummary() {
        return customerDetails.getOrderingRequests()  +"\t $"+ this.totalPrice;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
