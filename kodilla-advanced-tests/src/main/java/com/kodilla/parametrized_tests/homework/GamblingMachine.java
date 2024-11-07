package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


class GamblingMachine {

    private Random generator;

    public GamblingMachine(Random generator) {
        this.generator = generator;
    }

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }

    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 50);
    }

    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
