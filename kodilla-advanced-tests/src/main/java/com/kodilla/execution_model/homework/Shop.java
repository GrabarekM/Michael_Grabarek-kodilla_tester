package com.kodilla.parametrized_tests.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersByDateRange(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(order -> !order.getDate().isBefore(from) && !order.getDate().isAfter(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        return orders.stream()
                .mapToDouble(Order::getOrderValue)
                .sum();
    }
}