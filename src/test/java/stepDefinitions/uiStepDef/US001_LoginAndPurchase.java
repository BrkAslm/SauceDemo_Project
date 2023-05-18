package stepDefinitions.uiStepDef;

import enums.LINKS;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

import static stepDefinitions.Hooks.commonPage;
import static stepDefinitions.Hooks.driver;

public class US001_LoginAndPurchase {

    String locked_out_username = ConfigurationReader.getProperty("locked_out_user_username");


    @Given("user goes to login page")
    public void userGoesToLoginPage() {
        driver.get(ConfigurationReader.getProperty("baseUrl"));
    }

    @Given("user enters the username and password {string} and {string}")
    public void userEntersTheUsernameAndPasswordAnd(String arg0, String arg1) {
        commonPage.getLoginPage().userNameBox.sendKeys(arg0);
        commonPage.getLoginPage().passwordBox.sendKeys(arg1);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        commonPage.getLoginPage().loginButton.click();
    }

    @And("user selects an item on the page")
    public void userSelectsAnItemOnThePage() {
        commonPage.getHomePage().addtoCartBoldTshirt.get(0).click();
    }

    @And("user clicks on the basket icon to go to the basket")
    public void userClicksOnTheBasketIconToGoToTheBasket() {
        commonPage.getHomePage().goToCart.click();
    }

    @Given("user checks out")
    public void userChecksOut() {
        commonPage.getCartPage().checkOutButton.click();
    }

    @Given("user enters the firstname , lastname and postalcode {string} , {string} and {string}")
    public void userEntersTheFirstnameLastnameAndPostalcodeAnd(String arg0, String arg1, String arg2) {
        commonPage.getCheckoutPage().firstNameBox.sendKeys(arg0);
        commonPage.getCheckoutPage().lastNameBox.sendKeys(arg1);
        commonPage.getCheckoutPage().postalCodeBox.sendKeys(arg2);
    }

    @Given("user clicks continue button")
    public void userClicksContinueButton() {
        commonPage.getCheckoutPage().continueButton.click();
    }

    @Given("user clicks finish button")
    public void userClicksFinishButton() {
        commonPage.getCheckoutPage().finishButton.click();
    }

    @Given("assertion for successful purchase")
    public void assertionForSuccessfulPurchase() {
        Assert.assertEquals("Thank you for your order!",commonPage.getCheckoutPage().successMessageForFinish.getText());
    }
}