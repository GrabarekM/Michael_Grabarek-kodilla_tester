package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

    class UserValidatorTestSuite {

        private final UserValidator validator = new UserValidator();

        @ParameterizedTest
        @CsvSource({
                "user123,true",
                "user.name,true",
                "user-name,true",
                "u,false",
                "uuser@name,false",
                "user  name,false"
        })
        void ValidateUsername(String username, boolean expected) {
            assertEquals(expected, validator.validateUsername(username));
        }
        @ParameterizedTest
        @CsvSource({
                "user@test.com,true",
                "user.name@test.com,true",
                "user-name@test.com,true",
                "user@domain.test.com,true",
                "user@test,false",
                "user@test.veryverylongdomain,false",
                "user@.com,false",
                "user@com,false",
                "randomtext,false",
                "user@doubledott..com,false"
        })
        void ValidateEmail(String email, boolean expected) {
            assertEquals(expected, validator.validateEmail(email));
        }
    }
}