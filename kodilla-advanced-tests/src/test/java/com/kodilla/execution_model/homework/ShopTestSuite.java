package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTestSuite {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(100.0, LocalDate.of(2023, 1, 10), "user1"));
        shop.addOrder(new Order(250.0, LocalDate.of(2023, 5, 15), "user2"));
        shop.addOrder(new Order(300.0, LocalDate.of(2023, 3, 25), "user3"));
    }

    @Test
    public void shouldAddOrder() {
        Order newOrder = new Order(150.0, LocalDate.of(2023, 6, 1), "user4");
        shop.addOrder(newOrder);
        assertEquals(4, shop.getOrderCount());
    }

    @Test
    public void shouldNotAddDuplicateOrder() {
        Order duplicateOrder = new Order(100.0, LocalDate.of(2023, 1, 10), "user1");
        shop.addOrder(duplicateOrder);
        assertEquals(3, shop.getOrderCount());
    }

    @Test
    public void shouldReturnOrdersWithinDateRange() {
        List<Order> result = shop.getOrdersByDateRange(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 6, 1));
        assertEquals(3, result.size());
    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersWithinDateRange() {
        List<Order> result = shop.getOrdersByDateRange(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 6, 1));
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnOrdersWithinValueRange() {
        List<Order> result = shop.getOrdersByValueRange(100.0, 300.0);
        assertEquals(3, result.size());
    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersWithinValueRange() {
        List<Order> result = shop.getOrdersByValueRange(400.0, 500.0);
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnCorrectOrderCount() {
        assertEquals(3, shop.getOrderCount());
    }

    @Test
    public void shouldCalculateTotalOrderValue() {
        assertEquals(650.0, shop.getTotalOrderValue());
    }
}