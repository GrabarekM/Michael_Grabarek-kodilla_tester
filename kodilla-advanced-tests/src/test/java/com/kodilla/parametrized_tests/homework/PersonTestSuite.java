package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.BMISources#provideDataForBMICategory")
    void shouldReturnCorrectBMICategory(double heightInMeters, double weightInKilogram, String expectedCategory) {
        Person person = new Person(heightInMeters, weightInKilogram);
        String bmiCategory = person.getBMI();
        assertEquals(expectedCategory, bmiCategory);
    }
}