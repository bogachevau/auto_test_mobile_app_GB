package test_Android_iOS.tests.swipe;

import jdk.jfr.Description;
import org.testng.annotations.Test;
import test_Android_iOS.base.BaseTest;

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
