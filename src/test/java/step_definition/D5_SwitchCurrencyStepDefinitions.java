package step_definition;

import Pages.P5_SwitchCurrencyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;

public class D5_SwitchCurrencyStepDefinitions {

        P5_SwitchCurrencyPage switchCurr = Hooks.PageBase.p5_switchCurrPagePOM();

        @Given("user selects a product")
        public void user_select_a_product() {
            // Select a product using POM
            switchCurr.switchSelProdEle();
            BrowserUtils.waitFor(2);
        }

        @When("user changes the currency")
        public void user_changes_the_currency() {
            // Change Currency using POM
            switchCurr.switchCurrEle();
            BrowserUtils.waitFor(2);
        }

        @Then("user could find the selected currency")
        public void find_the_selected_currency()
        {
            // Change Currency Assertion using POM
            switchCurr.switchAsserEle();
            System.out.println("Price of the product is in Euro currency");
        }

    }