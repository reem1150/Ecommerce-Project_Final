package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class P5_SwitchCurrencyPage {

    public WebDriver driver;

    public P5_SwitchCurrencyPage(WebDriver driver) {
        this.driver = driver;
    }

    By switchSelProdPOM = By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");
    By switchCurrPOM = By.xpath("//option[.='Euro']");
    By switchAsserPOM = By.id("price-value-18");

    public void switchSelProdEle()
    {
        // Select a product
        driver.findElement(switchSelProdPOM).click();
    }

    public void switchCurrEle()
    {
        //Create object of the class
        driver.findElement(switchCurrPOM).click();
        Select selCurr = new Select(driver.findElement(switchCurrPOM));
        //Select the option from value
        selCurr.selectByValue("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop");

            }

    public void switchAsserEle()
    {
        //Change Currency Assertion using POM
        Assert.assertTrue(driver.findElement(switchAsserPOM).isDisplayed(),
                "Error Message: The currency has not been changed");

    }
}


