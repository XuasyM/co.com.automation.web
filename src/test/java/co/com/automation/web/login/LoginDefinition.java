package co.com.automation.web.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {

    @Steps
    LoginSteps loginSteps;

    @Given("^launch the saucedemo page$")
    public void launch_the_saucedemo_page() {
        loginSteps.openWebPage();
    }

    @When("^enter blocked user credentials \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter_blocked_user_credentials(String username, String password) {
        loginSteps.loginBlockedUser(username,password);
    }

    @Then("^check alert message \"([^\"]*)\"$")
    public void check_alert_message(String message) {
        loginSteps.validateErrorMessage(message);
    }
}
