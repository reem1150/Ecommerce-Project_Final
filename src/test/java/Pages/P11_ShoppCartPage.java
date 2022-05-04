package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class P11_ShoppCartPage {

    public WebDriver driver;

    public P11_ShoppCartPage(WebDriver driver) {
        this.driver = driver;
    }

    By shoppCartProd1CheckPOM = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr[1]/td[1]/input");
    By shoppCartProd2CheckPOM = By.xpath("//table[@class=\"cart\"]/tbody/tr[2]/td[1]/input");
    By shoppCartADDPOM = By.name("addtocartbutton");
    By shoppCartWaitPOM = By.cssSelector("td[class=\"sku\"]");

    public void shoppCartProdsCheckEle() {
        // Check product 1
        driver.findElement(shoppCartProd1CheckPOM).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait1.until(ExpectedConditions.elementToBeClickable(shoppCartProd1CheckPOM));
        // Check product 2
        driver.findElement(shoppCartProd2CheckPOM).click();
    }


    public void shoppCartADDEle() {
        // Add Wishlist products to CART
        driver.findElement(shoppCartADDPOM).click();
        // Wait until products appear in Shopping Cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(shoppCartWaitPOM));
    }
}



