package ru.test.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.test.base.BaseTest;
import ru.test.pages.SwipePage;

public class SwipeSteps extends BaseTest {
    SwipePage swipePage;

    @When("User click swipe button")
    public void user_click_swipe_button() {
        swipePage = openApp().clickSwipeMenuButton();
    }

    @Then("User should see text {string}")
    public void user_should_see_text(String string) {
        swipePage.checkSwipePageText(string);
    }
}
