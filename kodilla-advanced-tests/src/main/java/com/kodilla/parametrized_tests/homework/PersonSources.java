package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> provideDataForBMICategory() {
        return Stream.of(
                Arguments.of(1.80, 50, "Very severely underweight"),
                Arguments.of(1.80, 51.84, "Severely underweight"),
                Arguments.of(1.80, 59.04, "Underweight"),
                Arguments.of(1.80, 70, "Normal (healthy weight)"),
                Arguments.of(1.80, 85, "Overweight"),
                Arguments.of(1.80, 100, "Obese Class I (Moderately obese)"),
                Arguments.of(1.80, 115, "Obese Class II (Severely obese)"),
                Arguments.of(1.80, 130, "Obese Class III (Very severely obese)"),
                Arguments.of(1.80, 145, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.80, 160, "Obese Class V (Super Obese)"),
                Arguments.of(1.80, 180, "Obese Class VI (Hyper Obese)")
        );
    }

    // Nie działa
}