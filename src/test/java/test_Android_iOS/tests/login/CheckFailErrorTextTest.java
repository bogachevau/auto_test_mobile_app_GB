package test_Android_iOS.tests.login;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test_Android_iOS.base.BaseTest;
import test_Android_iOS.listeners.AllureListener;

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
