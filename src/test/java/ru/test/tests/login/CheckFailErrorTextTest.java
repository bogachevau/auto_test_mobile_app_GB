package ru.test.tests.login;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.test.base.BaseTest;
import ru.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFailErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test
    @Description("Проверяем поведение теста при падении проверки сообщения об ошибке валидного email")
    public void checkFailEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
}
