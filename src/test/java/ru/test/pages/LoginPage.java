package ru.test.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ru.test.locators.LoginPageLocators;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Кликаем по кнопке 'логин' в форме")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки ввода пароля")
    public LoginPage checkPasswordEmptyErrorText(String text) {
        $(locator().passwordEmptyErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
}
