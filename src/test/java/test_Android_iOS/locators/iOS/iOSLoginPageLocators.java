package test_Android_iOS.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import test_Android_iOS.locators.interfaces.LoginPageLocators;

public class iOSLoginPageLocators implements LoginPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return MobileBy.AccessibilityId("Please enter a valid email address");
    }

    @Override
    public By passwordEmptyErrorText() {
        return null;
    }
}
