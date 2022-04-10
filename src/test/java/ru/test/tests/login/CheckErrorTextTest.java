package ru.test.tests.login;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.test.base.BaseTest;
import ru.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидном email")
    public void checkEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}
