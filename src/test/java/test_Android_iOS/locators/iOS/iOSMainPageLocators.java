package test_Android_iOS.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import test_Android_iOS.locators.interfaces.MainPageLocators;

public class iOSMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    @Override
    public By swipeButton() {
        return null;
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
