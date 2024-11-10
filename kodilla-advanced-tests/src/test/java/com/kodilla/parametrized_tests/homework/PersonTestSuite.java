package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    @ParameterizedTest
    @CsvSource({
            "1.90, 50, Very severely underweight",
            "1.80, 50, Severely underweight",
            "1.70, 52, Underweight",
            "1.80, 70, Normal (healthy weight)",
            "1.75, 85, Overweight",
            "1.80, 100, Obese Class I (Moderately obese)",
            "1.75, 115, Obese Class II (Severely obese)",
            "1.80, 140, Obese Class III (Very severely obese)",
            "1.85, 160, Obese Class IV (Morbidly Obese)",
            "1.90, 200, Obese Class V (Super Obese)",
            "1.75, 220, Obese Class VI (Hyper Obese)"
    })
    public void shouldCalculateCorrectBMICategory(double height, double weight, String expectedCategory) {
        // given
        Person person = new Person(height, weight);
        // when
        String result = person.getBMI();
        // then
        assertEquals(expectedCategory, result);
    }
}