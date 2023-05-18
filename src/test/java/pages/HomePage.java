package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends CommonPage {
    @FindBy(css = "[data-test^='add-to-cart']")
    public List<WebElement> addtoCartBoldTshirt;

    @FindBy(css = "//a[@class='shopping_cart_link']")
    public WebElement goToCart;

}
//checkout