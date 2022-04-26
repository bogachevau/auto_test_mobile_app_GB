package ru.test.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.test.base.BaseTest;
import ru.test.pages.LoginPage;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;

    @Given("User is on Login page")
    public void user_is_on_Login_page() {
        loginPage = openApp().clickLoginMenuButton();
    }

    @When("User click login button")
    public void user_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("^User should see error message \"([^\"]*)\"$")
    public void user_should_see_error_message(String errorText) {
        loginPage.checkLoginErrorText(errorText);
    }

    @Then("^User should see error message password \"([^\"]*)\"$")
    public void user_should_see_error_message_password(String errorText) {
        loginPage.checkPasswordEmptyErrorText(errorText);
    }
}
