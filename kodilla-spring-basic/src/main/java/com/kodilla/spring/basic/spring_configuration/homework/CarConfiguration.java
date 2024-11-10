package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        String season = getSeason();
        int hour = getHour();

        Car car;
        switch (season) {
            case "summer":
                car = new Cabrio();
                break;
            case "winter":
                car = new SUV();
                break;
            default:
                car = new Sedan();
        }
        car.hasHeadlightsTurnedOn(hour);
        return car;
    }
    protected String getSeason() {
        return "fall";
    }
    protected int getHour() {
            return 12;
        }
}