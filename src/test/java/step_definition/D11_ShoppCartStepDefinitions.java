package step_definition;

import Pages.P11_ShoppCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class D11_ShoppCartStepDefinitions {

        P11_ShoppCartPage shoppCart = Hooks.PageBase.p11_shoppCartPagePOM();

        @And("logged user checks all his Wishlist products")
        public void Check_Wishlist_products()
        {
            // Check products using POM
            shoppCart.shoppCartProdsCheckEle();
        }

        @Then("logged user could add his Wishlist products to Shopping Cart")
            public void add_Wishlist_products_to_Shopping_Cart()
            {

                shoppCart.shoppCartADDEle();
                System.out.println("Elements in SKU are present in Shopping Cart");

                // Option 2 to wait until products appear in Shopping Cart
 //                Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

    }



