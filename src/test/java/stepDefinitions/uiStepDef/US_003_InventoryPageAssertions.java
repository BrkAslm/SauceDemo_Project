package stepDefinitions.uiStepDef;

import enums.COLOR;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.BrowserUtilities;

public class US_003_InventoryPageAssertions extends CommonPage {

    @Then("user is able to see the color of the button has changed")
    public void user_is_able_to_see_the_color_of_the_button_has_changed() {
        COLOR.assertBackgroundColor(COLOR.RED, getHomePage().addtoCartGeneral.get(0));
    }

    @Then("user is able to see the button text has changed to {string}")
    public void user_is_able_to_see_the_button_text_has_changed_to(String string) {
        Assert.assertEquals(string, getHomePage().addtoCartGeneral.get(0).getText());
    }


    @And("user able to see number is {int} on the cart icon")
    public void userAbleToSeeNumberIsOnTheCartIcon(int arg0) {
        BrowserUtilities.waitForVisibility(getHomePage().goToCartNumber, 5);
        Assert.assertEquals(arg0, Integer.parseInt(getHomePage().goToCartNumber.getText()));

    }

    @When("user selects a product on the inventory page")
    public void userSelectsAProductOnTheInventoryPage() {
        getHomePage().addtoCart.get(0).click();
    }
}
