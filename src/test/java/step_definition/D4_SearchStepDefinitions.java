package step_definition;

import Pages.P4_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class D4_SearchStepDefinitions{
    P4_SearchPage search = Hooks.PageBase.p4_searchPagePOM();


    @When("logged user clicks on search field")
    public void logged_user_clicks_on_search_field()
    {
        // click on search field using POM
        search.searchFieldEle();
    }

    @And("logged user searches with name of product")
    public void logged_user_searches_with_name_of_product()
    {

        // search for a product using POM
        search.searchProdEle("HTC");
        Hooks.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Then("logged user could find relative results")
    public void logged_user_could_find_relative_results()
    {
        // Assertion Product Result using POM
        search.searchAsserEle();
    }

}

