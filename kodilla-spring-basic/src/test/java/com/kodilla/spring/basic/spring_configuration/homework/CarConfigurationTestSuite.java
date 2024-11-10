package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarConfigurationTestSuite {
    private class TestCarConfiguration extends CarConfiguration {
        private final String season;
        private final int hour;

        public TestCarConfiguration(String season, int hour) {
            this.season = season;
            this.hour = hour;
        }
        @Override
        protected String getSeason() {
            return this.season;
        }
        @Override
        protected int getHour() {
            return this.hour;
        }
    }
    @Test
    public void shouldReturnCabrioInSummer() {
        CarConfiguration config = new TestCarConfiguration("summer", 12);
        Car car = config.car();
        assertEquals("Cabrio", car.getCarType());
    }
    @Test
    public void shouldReturnSUVInWinter() {
        CarConfiguration config = new TestCarConfiguration("winter", 12);
        Car car = config.car();
        assertEquals("SUV", car.getCarType());
    }
    @Test
    public void shouldReturnSedanInFall() {
        CarConfiguration config = new TestCarConfiguration("fall", 12);
        Car car = config.car();
        assertEquals("Sedan", car.getCarType());
    }
    @Test
    public void shouldHaveHeadlightsTurnedOnAtNight() {
        CarConfiguration config = new TestCarConfiguration("summer", 21);
        Car car = config.car();
        assertTrue(car.hasHeadlightsTurnedOn(21));
    }
    @Test
    public void shouldHaveHeadlightsTurnedOffDuringDay() {
        CarConfiguration config = new TestCarConfiguration("winter", 10);
        Car car = config.car();
        assertFalse(car.hasHeadlightsTurnedOn(10));
    }
}