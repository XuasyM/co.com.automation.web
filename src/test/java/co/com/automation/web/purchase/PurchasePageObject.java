package co.com.automation.web.purchase;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PurchasePageObject extends PageObject {

    @FindBy(css = ".product_sort_container")
    private WebElement dropdownProducts;

    @FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
    private WebElement btnAddToCart;

    @FindBy(css = ".shopping_cart_link")
    private WebElement btnShoppingCart;

    @FindBy(css = ".inventory_item_name")
    private WebElement lblProductName;

    @FindBy(css = ".inventory_item_desc")
    private WebElement lblProductDescription;

    @FindBy(css = ".inventory_item_price")
    private WebElement lblProductPrice;

    @FindBy(id = "checkout")
    private WebElement btnCheckout;

    @FindBy(id = "first-name")
    private WebElement texBoxFirstName;

    @FindBy(id = "last-name")
    private WebElement texBoxLastName;

    @FindBy(id = "postal-code")
    private WebElement texBoxPostalCode;

    @FindBy(id = "continue")
    private WebElement btnContinue;

    @FindBy(id = "finish")
    private WebElement btnFinish;

    @FindBy(css = ".title")
    private WebElement labelCheckoutComplete;

    public void orderProducts(){
        Select st = new Select(dropdownProducts);
        st.selectByValue("lohi");
    }

    public void selectFirstItem (){
        btnAddToCart.click();
    }

    public void openShoppingCart (){
        btnShoppingCart.click();
    }

    public String getProductName(){
        return lblProductName.getText();
    }

    public String getProductDescription(){
        return lblProductDescription.getText();
    }

    public String getProductPrice(){
        return lblProductPrice.getText();
    }

    public void clickBtnCheckout (){
        btnCheckout.click();
    }

    public void enterFirstName(String FirstName){
        texBoxFirstName.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        texBoxLastName.sendKeys(LastName);
    }

    public void enterPostalCode(String PostalCode){
        texBoxPostalCode.sendKeys(PostalCode);
    }

    public void clickBtnContinue (){
        btnContinue.click();
    }

    public void clickBtnFinish (){
        btnFinish.click();
    }

    public String getMessageCompleted(){
        return labelCheckoutComplete.getText();
    }
}
