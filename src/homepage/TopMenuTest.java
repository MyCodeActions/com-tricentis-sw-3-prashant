package homepage;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.awt.*;

/**
 * 1. create a class "TopMenuTest"
 * 1.1 create a method with the name "selectMenu()" It has one parameter name "menu" of type string
 * 1.2 This method should click on the menu whatever name is passed as a parameter.
 * 1.3. create the @Test method name verifyPageNavigation(). Use the selectMenu()
 * method to select the Menu and click on it and verify the page navigation.
 */


public class TopMenuTest extends Utility {


    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

  // create a method with the name "selectMenu()" It has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//div[@class='header-menu']"));
    }


  //  create the @Test method name verifyPageNavigation(). Use the selectMenu() method to select the Menu and click on it and verify the page navigation
    @Test
    public void verifyPageNavigation() {
        selectMenu("Books");
        String expectedText = "BOOKS";
        String actualText = driver.findElement(By.xpath("(//a[normalize-space()='Books'])[1]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
