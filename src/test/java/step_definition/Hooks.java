package step_definition;

import Pages.Page_Base;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;


public class Hooks {

    public static WebDriver driver;
    static Page_Base PageBase;
    public Select select ;

    @Before
    public static void user_opens_chrome_browser(){
        //select web driver to open browser
        // Option_1
        //String chromePath = getProperty("user.dir") + "\\src\\main\\resources\\chromedriver";
        //setProperty("webdriver.chrome.driver", chromePath);

        // Option_2
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Open home page and maximize
        // Resolution 1024x768px
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        PageBase = new Page_Base(driver);

    }

    @After
    public static void user_closes_the_driver() {
        BrowserUtils.waitFor(2);
        driver.quit();
    }
}
