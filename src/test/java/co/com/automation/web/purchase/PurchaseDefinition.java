package co.com.automation.web.purchase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PurchaseDefinition {

    @Steps
    PurchaseSteps purchaseSteps;

    @Given("^log in with an active user  \"([^\"]*)\" \"([^\"]*)\"$")
    public void log_in_with_an_active_user(String username, String password) {
        purchaseSteps.loginActiveUser(username,password);
    }

    @When("^select the lowest priced product$")
    public void select_the_lowest_priced_product() {
        purchaseSteps.SelectLowerPriceProduct();
    }

    @When("^carry out the purchase process \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void carry_out_the_purchase_process(String firstName, String lastName, String zipCode)  {
        purchaseSteps.completePurchase(firstName,lastName,zipCode);
    }

    @When("^confirm purchase$")
    public void confirm_purchase()  {
        purchaseSteps.confirmPurchase();
    }

    @Then("^verify successful purchase \"([^\"]*)\"$")
    public void verify_successful_purchase(String message) {
        purchaseSteps.validateMessage(message);
    }
}
