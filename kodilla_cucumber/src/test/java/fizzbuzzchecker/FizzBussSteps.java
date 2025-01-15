package fizzbuzzchecker;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.kodilla.fizzbuzz.FizzBuzzChecker.checkFizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBussSteps {
    private int inputNumber;
    private String answer;

    @Given("the input number is {int}")
    public void the_input_number_is_3(int number) {
        this.inputNumber = number;
    }

    @When("I check the FizzBuzz result")
    public void i_check_the_fizzbuzz_result() {
        this.answer = checkFizzBuzz(this.inputNumber);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, this.answer);
    }
}
