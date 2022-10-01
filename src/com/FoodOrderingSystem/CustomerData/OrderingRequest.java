package com.FoodOrderingSystem.CustomerData;

import com.FoodOrderingSystem.Notifications.NotificationSystem;


public class OrderingRequest {
    private PizzaOrder pizzaOrder;
    private PastaOrder pastaOrder;

    private NotificationSystem notificationSystem;

    public NotificationSystem getNotificationSystem() {
        return notificationSystem;
    }

    public void setNotificationSystem(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }

    public PizzaOrder getPizzaOrder() {
        return pizzaOrder;
    }

    public void setPizzaOrder(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public PastaOrder getPastaOrder() {
        return pastaOrder;
    }

    public void setPastaOrder(PastaOrder pastaOrder) {
        this.pastaOrder = pastaOrder;
    }

    @Override
    public String toString() {
        return "" +
                " " + pizzaOrder +
                ", " + pastaOrder +
                '}';
    }
}
