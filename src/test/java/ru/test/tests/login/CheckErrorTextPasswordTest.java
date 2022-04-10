package ru.test.tests.login;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import ru.test.base.BaseTest;

public class CheckErrorTextPasswordTest extends BaseTest {

    public static final String VALID_PASSWORD = "Please enter at least 8 characters";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидном пароле")
    public void checkEmptyPassword() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkPasswordEmptyErrorText(VALID_PASSWORD);
    }
}
