package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

    @FindBy(css = "firstName")
    public WebElement firstNameBox;

    @FindBy(css = "lastName")
    public WebElement lastNameBox;

    @FindBy(css = "postalCode")
    public WebElement postalCodeBox;

    @FindBy(css = "continue")
    public WebElement continueButton;

    @FindBy(css = "finish")
    public WebElement finishButton;

    @FindBy(xpath = "//h2")
    public WebElement successMessageForFinish;
}
