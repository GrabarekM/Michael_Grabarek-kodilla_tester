package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {

    @Test
    public void testIsOrderNumberAvailable() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        Order order1 = new Order("123");
        Order order2 = new Order("321");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        // when
        Order order = warehouse.getOrder("123");
        // then
        assertNotNull(order);
        assertEquals("123", order.getNumber());
    }
    @Test
    public void testException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("123123"));
    }
}