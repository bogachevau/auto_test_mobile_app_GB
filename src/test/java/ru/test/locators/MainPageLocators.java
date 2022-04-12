package ru.test.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By swipeButton() {
        return MobileBy.AccessibilityId("Swipe");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
