package ru.test.tests.main;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.test.base.BaseTest;
import ru.test.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest {

    @Test
    @Description("Проверяем UI главной страницы с помощью скриншота")
    public void checkMainPageScreenshot() {
        openApp()
                .checkScreenshot();
    }
}
