package co.com.automation.web.purchase;

import co.com.automation.web.login.LoginPageObject;
import co.com.automation.web.model.Product;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.core.Serenity;

public class PurchaseSteps {

    LoginPageObject loginPageObject;
    PurchasePageObject purchasePageObject;
    Product product = new Product();

    @Step
    public void loginActiveUser(String username, String password){
        loginPageObject.open();
        loginPageObject.enterUsername(username);
        loginPageObject.enterPassword(password);
        loginPageObject.clickLoginButton();
    }

    @Step
    public void SelectLowerPriceProduct(){
        purchasePageObject.orderProducts();
        purchasePageObject.selectFirstItem();
        purchasePageObject.openShoppingCart();

        product.setName(purchasePageObject.getProductName());
        product.setDescription(purchasePageObject.getProductDescription());
        product.setPrice(purchasePageObject.getProductPrice());
        purchasePageObject.clickBtnCheckout();
    }

    @Step
    public void completePurchase (String firstName, String lastName, String zipCode){
        purchasePageObject.enterFirstName(firstName);
        purchasePageObject.enterLastName(lastName);
        purchasePageObject.enterPostalCode(zipCode);
        purchasePageObject.clickBtnContinue();
    }

    @Step
    public void confirmPurchase (){
        assertThat(product.getName(),containsString(purchasePageObject.getProductName()));
        assertThat(product.getDescription(),containsString(purchasePageObject.getProductDescription()));
        assertThat(product.getPrice(),containsString(purchasePageObject.getProductPrice()));
        purchasePageObject.clickBtnFinish();
    }

    @Step
    public void validateMessage(String message){
        assertThat(purchasePageObject.getMessageCompleted(),containsString(message));
        Serenity.takeScreenshot();
    }
}
