package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class CartPage extends CommonPage {
        @FindBy(css = "checkout")
        public WebElement checkOutButton;

    }


