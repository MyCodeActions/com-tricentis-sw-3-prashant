package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }


    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     *
     *This method will select dropdown
     */
    public void selectFromDropDown(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    public void assertMethod(String expected, By by) {
        String expectedText = "Build your own computer";
        String actualText = driver.findElement(by).getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
