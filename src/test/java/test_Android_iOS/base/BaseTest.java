package test_Android_iOS.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import test_Android_iOS.pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.close;

public class BaseTest {

    public MainPage openApp() {
        WebDriver driver = null;
        try {
            driver = getDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Opps, we have problems with URL for driver!");
        }

        WebDriverRunner.setWebDriver(driver);
        return new MainPage();
    }

    public static WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (System.getProperty("platform")) {
            case "Android":
                // устанавливаем capabilities.
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Pixel_2");
                capabilities.setCapability("platformVersion", "9");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("app",
                        "D:\\Programm\\Android\\ADB\\platform-tools\\Android-NativeDemoApp-0.2.1.apk");
                break;
            case "iOS":
                // устанавливаем capabilities.
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "iPhone");
                capabilities.setCapability("platformVersion", "15");
                capabilities.setCapability("udid", "Тут должен быть ID симулятора");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("app",
                        "D:\\Programm\\Android\\ADB\\platform-tools\\iOS-NativeDemoApp-0.2.1.app");
                break;
        }

        // Папка для сохранения скриншотов selenide.
        Configuration.reportsFolder = "screenshots/actual";

        // Устанавливаем и открываем приложение.
        return new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void setDown() {
        close();
    }
}
