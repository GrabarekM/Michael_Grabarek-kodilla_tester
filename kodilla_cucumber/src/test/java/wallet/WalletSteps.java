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
        cashier.withdraw(wallet, -30);
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
}