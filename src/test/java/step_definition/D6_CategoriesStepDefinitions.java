package step_definition;

import Pages.P6_CategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class D6_CategoriesStepDefinitions {

    P6_CategoriesPage category = Hooks.PageBase.p6_categoriesPagePOM();

    @Given("logged user can select Random Category")
    public void select_random_Category() {
        // Select random category using POM
        category.categoryRandomEle();
        BrowserUtils.waitFor(2);
    }


    @Then("logged user could hover and open sub-Category")
    public void open_subCategory() {
        // Hover and open subCategory from Category using POM
        category.categorySubEle();
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }
}