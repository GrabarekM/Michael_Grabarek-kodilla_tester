package com.kodilla.parametrized_tests.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double orderValue;
    private LocalDate date;
    private String userLogin;

    public Order(double orderValue, LocalDate date, String userLogin) {
        this.orderValue = orderValue;
        this.date = date;
        this.userLogin = userLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUserLogin() {
        return userLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.orderValue, orderValue) == 0 &&
                Objects.equals(date, order.date) &&
                Objects.equals(userLogin, order.userLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, date, userLogin);
    }
}