package test_Android_iOS.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import test_Android_iOS.locators.interfaces.SwipePageLocators;

public class AndroidSwipePageLocators implements SwipePageLocators {
    @Override
    public By swipePageText() {
        return MobileBy.xpath("//android.view.ViewGroup" +
                "[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");
    }
}
