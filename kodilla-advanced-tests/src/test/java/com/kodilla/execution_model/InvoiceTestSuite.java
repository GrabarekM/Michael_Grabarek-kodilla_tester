package com.kodilla.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    private Invoice invoice;

    @BeforeEach
    void setUp() {
        invoice = new Invoice();
    }

    @Test
    void shouldIncreaseSizeWhenAddingNewItems() {
        // given
        Item item1 = new Item("Laptop", 1200.00);
        Item item2 = new Item("Mouse", 25.50);
        // when
        invoice.addItem(item1);
        invoice.addItem(item2);
        // then
        assertEquals(2, invoice.getSize());
    }

    @Test
    void shouldReturnCorrectItemDetails() {
        // given
        Item item = new Item("Keyboard", 45.75);
        invoice.addItem(item);
        // when
        Item result = invoice.getItem(0);
        // then
        assertNotNull(result);
        assertEquals("Keyboard", result.getName());
        assertEquals(45.75, result.getPrice());
    }

    @Test
    void shouldReturnNullWhenIndexIsNegative() {
        // given
        Item item = new Item("Monitor", 299.99);
        invoice.addItem(item);
        // when
        Item result = invoice.getItem(-1);
        // then
        assertNull(result);
    }

    @Test
    void shouldReturnNullWhenIndexIsOutOfListSize() {
        // given
        Item item = new Item("Printer", 89.99);
        invoice.addItem(item);
        // when
        Item result = invoice.getItem(5);
        // then
        assertNull(result);
    }

    @Test
    void shouldClearAllItems() {
        // given
        invoice.addItem(new Item("Desk", 250.00));
        invoice.addItem(new Item("Chair", 75.00));
        // when
        invoice.clear();
        // then
        assertEquals(0, invoice.getSize());
    }
}