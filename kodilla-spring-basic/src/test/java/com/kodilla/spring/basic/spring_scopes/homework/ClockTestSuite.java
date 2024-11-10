package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ClockTestSuite {

    @Autowired
    private org.springframework.context.ApplicationContext context;

    @Test
    public void shouldReturnDifferentTimesForDifferentInstances() {
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);

        assertNotEquals(clock1.getCurrentTime(), clock2.getCurrentTime(), "Różne czasy");
    }
}