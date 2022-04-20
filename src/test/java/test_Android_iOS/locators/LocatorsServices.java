package test_Android_iOS.locators;

import test_Android_iOS.locators.Android.AndroidLoginPageLocators;
import test_Android_iOS.locators.Android.AndroidMainPageLocators;
import test_Android_iOS.locators.Android.AndroidSwipePageLocators;
import test_Android_iOS.locators.iOS.iOSLoginPageLocators;
import test_Android_iOS.locators.iOS.iOSMainPageLocators;
import test_Android_iOS.locators.iOS.iOSSwipePageLocators;
import test_Android_iOS.locators.interfaces.LoginPageLocators;
import test_Android_iOS.locators.interfaces.MainPageLocators;
import test_Android_iOS.locators.interfaces.SwipePageLocators;

public class LocatorsServices {

    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new iOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new iOSLoginPageLocators();
    public static final SwipePageLocators SWIPE_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidSwipePageLocators() : new iOSSwipePageLocators();
}
