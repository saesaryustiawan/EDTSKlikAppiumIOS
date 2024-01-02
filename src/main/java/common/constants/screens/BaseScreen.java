package common.constants.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class BaseScreen {
    public final WebDriver driver;
    public final WebDriverWait wait;

    public BaseScreen(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public boolean isDisplayed(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void inputText(By by, String text) {
        scrollForMobile(by);
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text, Keys.ENTER);
    }

    public void clearText(By by) {
        scrollForMobile(by);
        waitUntilElementVisible(by);
        driver.findElement(by).clear();
    }

    public void tap(By by) {
        try {
            scrollForMobile(by);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            driver.findElement(by).click();
            System.out.println("Element " + by + " exists");
        } catch (TimeoutException e) {
            System.out.println("Element " + by + " not exists");
        }
    }

    private boolean isAndroid() {
        return driver instanceof AndroidDriver;
    }

    public void scrollForMobile(By by) {
        String previousPageSource = "";
        while (isElementNotEnabled(by) && isNotEndOfPage(previousPageSource)) {
            previousPageSource = driver.getPageSource();
            performScroll();
        }
    }

    private boolean isNotEndOfPage(String previousPageSource) {
        return !previousPageSource.equals(driver.getPageSource());
    }

    private boolean isElementNotEnabled(WebElement element) {
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    private boolean isElementNotEnabled(By by) {
        List<WebElement> elements = driver.findElements(by);
        if (isAndroid()) {
            return elements.isEmpty();
        }
        if (!elements.isEmpty()) {
            return elements.get(0).getAttribute("visible").equalsIgnoreCase("false");
        }
        return true;
    }

    private void performScroll() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int endX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endY = (int) (size.getHeight() * 0.25);

        performScrollUsingSequence(startX, startY, endX, endY);
    }

    private void performScrollUsingSequence(int startX, int startY, int endX, int endY) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "first-finger");
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        ((AppiumDriver) (driver)).perform(Collections.singletonList(sequence));
    }
}
