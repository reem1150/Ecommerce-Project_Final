package Pages;

import org.openqa.selenium.WebDriver;

public class Page_Base {
    public WebDriver driver;


    public Page_Base(WebDriver driver) {
        this.driver = driver;
    }

    public P1_RegistrationPage p1_registrationPagePOM() {return new P1_RegistrationPage(driver);}

    public P2_LoginPage p2_loginPagePOM() {return new P2_LoginPage(driver);}

    public P3_RestPassPage p3_restPassPagePOM() {return new P3_RestPassPage(driver);}

    public P4_SearchPage p4_searchPagePOM() {return new P4_SearchPage(driver);}

    public P5_SwitchCurrencyPage p5_switchCurrPagePOM() {return new P5_SwitchCurrencyPage(driver);}

    public P6_CategoriesPage p6_categoriesPagePOM() {
        return new P6_CategoriesPage(driver);
    }

    public P7_FilterColorPage p7_filterColorPagePOM()
    {
        return new P7_FilterColorPage(driver);
    }

    public P8_SelectTagsPage p8_selectTagsPagePOM()
    {
        return new P8_SelectTagsPage(driver);
    }

    public P9_CompareListPage p9_compareListPagePOM()
    {
        return new P9_CompareListPage(driver);
    }

    public P10_WishlistPage p10_wishlistPageElementsPOM()
    {
        return new P10_WishlistPage(driver);
    }

    public P11_ShoppCartPage p11_shoppCartPagePOM()
    {
        return new P11_ShoppCartPage(driver);
    }

    public P12_OrderCheckPage p12_orderCheckPagePOM()
    {
        return new P12_OrderCheckPage(driver);
    }



}
