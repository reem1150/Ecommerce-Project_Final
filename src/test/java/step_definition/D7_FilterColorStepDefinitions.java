package step_definition;

import Pages.P7_FilterColorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class D7_FilterColorStepDefinitions {

    P7_FilterColorPage color = Hooks.PageBase.p7_filterColorPagePOM();

    @Given("logged user selects Category and hover to open sub-Category")
    public void select_Category_and_hover_to_open_SubCategory() {
        // Select Apparel Category and hover to open Shoes sub-Category using POM
        color.colorSelProdEle();
        BrowserUtils.waitFor(2);
    }


    @When("logged user can filter sub-Category with color")
    public void Filter_subCategory_with_color()
    {
        // Filter Shoes Product with Color using POM
        color.colorFilterEle();
    }


    @Then("logged user could find product with the selected color")
    public void Find_product_with_the_selected_color()
    {
        // Check Selected Color using POM
        Hooks.driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        color.colorCheckEle();
        System.out.println("Color Selected: Red Shoes");
    }

}

