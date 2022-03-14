package homeWork2;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstMobileTest {

    @Test
    public void testCheckEmptyEmail() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Redmi Note 7");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "deb7845");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app",
                "D:\\Programm\\Android\\ADB\\platform-tools\\Android-NativeDemoApp-0.2.1.apk");

        MobileDriver mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MobileElement loginMenuButton = (MobileElement) mobileDriver.findElementByAccessibilityId("Login");
        loginMenuButton.click();

        Thread.sleep(2000);

        MobileElement loginButton = (MobileElement) mobileDriver.findElementByAccessibilityId("button-LOGIN");
        loginButton.click();

        Thread.sleep(2000);

        MobileElement errorText = (MobileElement) mobileDriver.findElementByXPath(
                "//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/" +
                        "android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");

        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");

        mobileDriver.quit();
    }

    @Test
    public void testCheckEmptyPassword() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Redmi Note 7");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "deb7845");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app",
                "D:\\Programm\\Android\\ADB\\platform-tools\\Android-NativeDemoApp-0.2.1.apk");

        MobileDriver mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        MobileElement loginMenuButton = (MobileElement) mobileDriver.findElementByAccessibilityId("Login");
        loginMenuButton.click();

        Thread.sleep(2000);

        MobileElement loginButton = (MobileElement) mobileDriver.findElementByAccessibilityId("button-LOGIN");
        loginButton.click();

        Thread.sleep(2000);

        MobileElement errorText = (MobileElement) mobileDriver.findElementByXPath(
                "//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]");

        Assert.assertEquals(errorText.getText(), "Please enter at least 8 characters");
        mobileDriver.quit();
    }

    @Test
    public void testCheckValidLoginAndPassword() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Redmi Note 7");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "deb7845");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app",
                "D:\\Programm\\Android\\ADB\\platform-tools\\Android-NativeDemoApp-0.2.1.apk");

        MobileDriver mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MobileElement loginMenuButton = (MobileElement) mobileDriver.findElementByAccessibilityId("Login");
        loginMenuButton.click();

        Thread.sleep(2000);

        MobileElement emailInput = (MobileElement) mobileDriver.findElementByAccessibilityId("input-email");
        emailInput.sendKeys("test@test.ru");

        MobileElement passwordInput = (MobileElement) mobileDriver.findElementByAccessibilityId("input-password");
        passwordInput.sendKeys("test12345");

        MobileElement loginButton = (MobileElement) mobileDriver.findElementByAccessibilityId("button-LOGIN");
        loginButton.click();

        Thread.sleep(5000);

        MobileElement alertButton = (MobileElement) mobileDriver.findElementById("android:id/alertTitle");
        String string = alertButton.getText();

        Assert.assertEquals(string, "Success");

        mobileDriver.quit();
    }

    @Test
    public void testSwipeButton() throws InterruptedException, MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Redmi Note 7");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "deb7845");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app",
                "D:\\Programm\\Android\\ADB\\platform-tools\\Android-NativeDemoApp-0.2.1.apk");

        MobileDriver mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        MobileElement swipeButton = (MobileElement) mobileDriver.findElementByAccessibilityId("Swipe");
        swipeButton.click();

        Thread.sleep(2000);

        MobileElement cardMessage = (MobileElement) mobileDriver.findElementByXPath("//android.view.ViewGroup" +
                "[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");
        String string = cardMessage.getText();

        Assert.assertEquals(string, "Swipe horizontal");

        mobileDriver.quit();
    }

}
