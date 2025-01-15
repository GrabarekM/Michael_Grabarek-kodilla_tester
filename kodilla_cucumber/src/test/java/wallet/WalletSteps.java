package wallet;

import com.kodilla.wallet.CashSlot;
import com.kodilla.wallet.Cashier;
import com.kodilla.wallet.Wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private Cashier cashier;

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("my wallet is empty")
    public void my_wallet_is_empty() {
        assertEquals(0, wallet.getBalance(), "Wallet is not empty");
    }

    @When("I request $30")
    public void i_request_$30() {
        cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @When("I request $300")
    public void i_request_$300() {
        cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 300);
    }

    @When("I request $200")
    public void i_request_$200() {
        cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @When("I request $0")
    public void i_request_$0() {
        cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @When("I request -$30")
    public void i_request_negative_$30() {
        cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents(), "Incorrect cash slot contents");
    }

    @Then("$200 should be dispensed")
    public void $200_should_be_dispensed() {
        assertEquals(200, cashSlot.getContents(), "Incorrect cash slot contents");
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "Cash slot should be empty");
    }

    @Then("the balance should remain ${int}")
    public void the_balance_should_remain_$(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance(), "Wallet balance mismatch");
    }

    @Then("the balance should be $0")
    public void the_balance_should_be_$0() {
        assertEquals(0, wallet.getBalance(), "Wallet should be empty");
    }
    @Given("there is ${int} in my wallet")
    public void there_is_$int_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$int(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance(), "Displayed balance is incorrect");
    }

    @When("I withdraw ${int}")
    public void i_withdraw_$int(Integer amount) {
        cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_I_don_t_have_enough_money_in_my_wallet() {
        assertEquals(0, cashSlot.getContents(), "Cash should not have been dispensed");
    }
}