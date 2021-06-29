package co.com.automation.web.login;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPageObject extends PageObject {

    @FindBy(id = "user-name")
    private WebElement texBoxUserName;

    @FindBy(id = "password")
    private WebElement texBoxPassword;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    @FindBy(css = ".error-message-container.error")
    private WebElement labelUserBlocked;

    public void enterUsername(String username){
        texBoxUserName.sendKeys(username);
    }

    public void enterPassword(String password){
        texBoxPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        btnLogin.click();
    }

    public String getMessage(){
        return labelUserBlocked.getText();
    }
}
