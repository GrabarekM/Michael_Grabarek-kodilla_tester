package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("321"));
        warehouse.addOrder(new Order("213"));
        try {
            Order order = warehouse.getOrder("3221");
            System.out.println("Order present: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no such order go again");
        } finally {
            System.out.println("Thanks for searching!");
        }
    }
}