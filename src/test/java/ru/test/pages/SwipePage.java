package ru.test.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ru.test.locators.SwipePageLocators;

import static com.codeborne.selenide.Selenide.$;

public class SwipePage {

    private SwipePageLocators locator() {
        return new SwipePageLocators();
    }

    @Step("Проверяем текст страницы Swipe")
    public SwipePage checkSwipePageText(String text) {
        $(locator().swipePageText()).shouldHave(Condition.text(text));
        return new SwipePage();
    }
}
