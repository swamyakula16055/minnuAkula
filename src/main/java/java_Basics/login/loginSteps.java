package java_Basics.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static java_Basics.login.loginTest.login;

public class loginSteps {
    @Given("user navigates to url")
    public void user_navigates_to_url() throws IOException {
        login();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws IOException {
        login();

    }

    @Then("login successfully")
    public void login_successfully() throws IOException {
        login();

    }

}
