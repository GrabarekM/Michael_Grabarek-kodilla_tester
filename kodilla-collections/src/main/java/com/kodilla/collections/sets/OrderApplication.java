package com.kodilla.collections.sets;

import java.util.Set;
import java.util.HashSet;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order ("1/2019", "Iron", 1.0));
        orders.add(new Order ("2/2019", "Cuterly", 6.0));
        orders.add(new Order ("3/2019", "Chair", 2.0));
        orders.add(new Order ("1/2019", "Iron", 1.0));
        System.out.println(orders.size());
        for (Order order : orders){
            System.out.println(order);
        }

    }
}
