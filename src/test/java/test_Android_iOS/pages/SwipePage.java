package test_Android_iOS.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import test_Android_iOS.locators.LocatorsServices;
import test_Android_iOS.locators.interfaces.SwipePageLocators;

import static com.codeborne.selenide.Selenide.$;

public class SwipePage {

    private SwipePageLocators locator() {
        return LocatorsServices.SWIPE_PAGE_LOCATORS;
    }

    @Step("Проверяем текст страницы Swipe")
    public SwipePage checkSwipePageText(String text) {
        $(locator().swipePageText()).shouldHave(Condition.text(text));
        return new SwipePage();
    }
}
