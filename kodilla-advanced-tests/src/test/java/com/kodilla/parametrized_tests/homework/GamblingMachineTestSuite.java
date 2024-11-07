package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine;
class TestRandom extends Random {
    private int[] values = {3, 11, 10, 4, 5, 20};
    int i = 0;
    @Override
    public int nextInt(int bound) {
        return values[i++];
    }
}
//  Before each wywoluje wszystkie przed
    @BeforeEach
    void setUp() {
        gamblingMachine = new GamblingMachine(new TestRandom());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/number.csv", numLinesToSkip = 1)
    void shouldCalculateWinsCorrectly(int num1, int num2, int num3, int num4, int num5, int num6, int expectedWins) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(num1);
        userNumbers.add(num2);
        userNumbers.add(num3);
        userNumbers.add(num4);
        userNumbers.add(num5);
        userNumbers.add(num6);
        int result = gamblingMachine.howManyWins(userNumbers);
        assertEquals(expectedWins, result);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/invalid_numbers.csv", numLinesToSkip = 1)
    void shouldThrowExceptionWhenInvalidNumbersProvided(int num1, int num2, int num3, int num4, int num5, int num6) {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(num1);
        userNumbers.add(num2);
        userNumbers.add(num3);
        userNumbers.add(num4);
        userNumbers.add(num5);
        userNumbers.add(num6);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));


        // Pytanie - Czemu zawsze actual nie jest expected.
    }
}