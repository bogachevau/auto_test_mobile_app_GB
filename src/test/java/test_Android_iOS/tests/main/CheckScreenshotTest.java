package test_Android_iOS.tests.main;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test_Android_iOS.base.BaseTest;
import test_Android_iOS.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем UI главной страницы с помощью скриншота")
    public void checkMainPageScreenshot() {
        openApp()
                .checkScreenshot();
    }
}
