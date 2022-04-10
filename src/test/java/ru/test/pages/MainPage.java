package ru.test.pages;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import ru.test.locators.MainPageLocators;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class MainPage {

    private MainPageLocators locator() {
        return new MainPageLocators();
    }

    @Step("Кликаем на кнопку логина в меню и переходим на новую страницу логина")
    public LoginPage clickLoginMenuButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Кликаем на кнопку Swipe в меню и переходим на новую страницу swipe")
    public SwipePage clickSwipeMenuButton() {
        $(locator().swipeButton()).click();
        return new SwipePage();
    }

    @Step("Делаем скриншот главной страницы и сравниваем с требованием")
    public MainPage checkScreenshot() {
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources(
                "src/main/resources/expectedScreenshots/mainPage.png");
        File actualScreenshot = $(locator().homeScreen()).screenshot();
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" +
                actualScreenshot.getName());
        File resultDestination = new File("diff/diff_CheckMainPageScreenshot.png");
        ImageComparisonResult imageComparisonResult = new
                ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

    @Step("Делаем проверку падения теста по скриншоту.")
    public MainPage checkFailScreenshot() {
        // Загружаем ожидаемо неверное изображение для сравнения.
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources(
                "src/main/resources/expectedScreenshots/failTest.png");
        // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
        File actualScreenshot = $(locator().homeScreen()).screenshot();
        // Загружаем актуальный скриншот.
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources(
                "screenshots/actual/" + actualScreenshot.getName());

        // Где будем хранить скриншот с различиями в случае падения теста.
        File resultDestination = new File("diff/diff_CheckFailMainPageScreenshot.png");

        // Сравниваем.
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage,
                resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }
}
