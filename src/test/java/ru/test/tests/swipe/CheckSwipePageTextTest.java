package ru.test.tests.swipe;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import ru.test.base.BaseTest;

public class CheckSwipePageTextTest extends BaseTest {

    public static final String SWIPE_HORIZONTAL = "Swipe horizontal";

    @Test
    @Description("Проверяем текст на странице Swipe")
    public void checkSwipePageText() {
        openApp()
                .clickSwipeMenuButton()
                .checkSwipePageText(SWIPE_HORIZONTAL);
    }
}
