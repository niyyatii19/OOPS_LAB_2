package com.FoodOrderingSystem.CustomerData;

import com.FoodOrderingSystem.Notifications.NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {
    private int tableNo = 0;
    private String name;
    private int age;
    private List<OrderingRequest> orderingRequests = new ArrayList<>();
    private NotificationSystem notificationSystem;


    public int getTableNo() {
        return tableNo;
    }

    public CustomerDetails(String name, int age) {
        this.tableNo++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addOrder(OrderingRequest orderingRequest){
        orderingRequests.add(orderingRequest);
    }

    public List<OrderingRequest> getOrderingRequests() {
        return orderingRequests;
    }

    public String orderedItems(List<OrderingRequest> orderingRequests){
        return orderingRequests.toString();
    }
    public NotificationSystem getNotificationSystem() {
        return notificationSystem;
    }

    public void setNotificationSystem(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }
}
