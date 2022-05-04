package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P3_RestPassPage {
    public WebDriver driver;

    public P3_RestPassPage(WebDriver driver) {
        this.driver = driver;
    }

    By restForgotBtnPOM = By.cssSelector("a[href=\"/passwordrecovery\"]");
    By restEmailPOM = By.cssSelector("input.email");
    By restRecoverBtnPOM = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
    By restAsserPOM = By.className("content");
    By restCloseBarPOM = By.xpath("//span[@class=\"close\"]");

    public void restForgotPassButtonEle()
    {
        // Press Forgot Password Button
        driver.findElement(restForgotBtnPOM).click();
    }

    public void restEmailEle(String email)
    {
        // Enter valid email
        // user registration email
        driver.findElement(restEmailPOM).click();
        driver.findElement(restEmailPOM).clear();
        driver.findElement(restEmailPOM).sendKeys(email);
    }

    public void restRecoverButtonEle()
    {
        // Press Recover Button
        driver.findElement(restRecoverBtnPOM).click();
    }


    public String restAsserEle()
    {
        // Reset Password Assertion
        String actualResult = driver.findElement(restAsserPOM).getText();
        return actualResult;
    }


    public void restCloseBar()
    {
        // Close notification bar
        driver.findElement(restCloseBarPOM).click();
    }
}
