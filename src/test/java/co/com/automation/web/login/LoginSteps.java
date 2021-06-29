package co.com.automation.web.login;

import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.core.Serenity;

public class LoginSteps {

    LoginPageObject loginPageObject;

    @Step
    public void openWebPage(){
        loginPageObject.open();
    }

    @Step
    public void loginBlockedUser(String username, String password){
        loginPageObject.enterUsername(username);
        loginPageObject.enterPassword(password);
        loginPageObject.clickLoginButton();
    }

    @Step
    public void validateErrorMessage(String message){
        assertThat(loginPageObject.getMessage(),containsString(message));
        Serenity.takeScreenshot();
    }
}
