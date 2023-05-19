package enums;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.commonPage;

public enum COLOR {

    RED("rgba(226, 35, 26, 1)"),
    GREEN("rgb(61, 220, 145)"),
    BLACK("rgb(19, 35, 34)"),
    WHITE("rgb(255, 255, 255)"),

        ;
    private String colour;

    COLOR(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static void assertBackgroundColor(COLOR color, WebElement webElement){
        Assert.assertEquals(color.getColour(),webElement.getCssValue("outline-color"));
    }
}

