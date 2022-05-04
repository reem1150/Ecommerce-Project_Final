package step_definition;

import Pages.P1_RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;


public class D1_RegistrationStepDefinition {
    P1_RegistrationPage register = Hooks.PageBase.p1_registrationPagePOM();

    @Given(value = "new user navigates to registration page")
    public void navigate_to_registration() {
        // Register as new user using POM//
        register.registerPageEle();
    }

    // Write Valid Email with Random Generator//
    static Random randomGenerator = new Random();


    public static String email = "reem.abdulla@gmail.com";
    public static String pass = "123456";
    public static String FirstName = "reem";
    public static String LastName = "abdulla";
    public static String CompName = "aa";


    @And("new user fills registration form with valid data")
    public void new_user_fills_registration_form_with_valid_data() {
        // Fill valid Data using POM //
        register.registerDataEle(FirstName, LastName, email, pass, CompName);
    }

    @When("new user clicks on register button")
    public void click_register_button() {
        // click Register Button using POM //
        register.registerButtonEle();
    }

    // Compare Actual with Expected Result //
    @Then("a success message is displayed")
    public void a_success_message_is_displayed()
    {
        // Registration Assertion 1 using POM //
        register.registerAsserEle();
        System.out.println("Assertion: Your registration completed");

        // Registration Assertion 2 using POM//
        String expectedResult = "Your registration completed";
       // Assert.assertEquals(register.registerAsserEle(), expectedResult, "Registration Failed");
        Assert.assertTrue(register.registerAsserEle().contains(expectedResult), "Assertion False: User cant register successfully");
        System.out.println("Congratulations! Your registration completed");
    }
   @And("user logs out after registering")
    public void log_out_after_registering()
    {
        // Logout from account using POM//
        register.registerLogoutEle();
    }
    }
