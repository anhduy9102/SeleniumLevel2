package core;

import common.drivers.DriverManagerFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementWrapper {
    private static final int DEFAULT_WAIT = 10;

    private static WebDriver getDriver() {
        return DriverManagerFactory.getDriver();
    }

    private static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(DEFAULT_WAIT));
    }

    /** Wait for element to be visible and return it */
    public static WebElement waitForVisible(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /** Wait for element to be clickable and return it */
    public static WebElement waitForClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    /** Click with waiting */
    public static void click(By locator) {
        WebElement element = waitForClickable(locator);
        element.click();
    }

    /** Type text after clearing existing text */
    public static void type(By locator, String text) {
        WebElement element = waitForVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    /** Get element text (waits for visibility) */
    public static String getText(By locator) {
        return waitForVisible(locator).getText();
    }

    /** Check if element is visible */
    public static boolean isVisible(By locator) {
        try {
            return waitForVisible(locator).isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    /** Check if element exists in DOM (no wait) */
    public static boolean exists(By locator) {
        List<WebElement> elements = getDriver().findElements(locator);
        return !elements.isEmpty();
    }

    /** Get attribute value */
    public static String getAttribute(By locator, String attribute) {
        return waitForVisible(locator).getAttribute(attribute);
    }

    /** Safe click with retry in case of stale element */
    public static void safeClick(By locator) {
        int retries = 2;
        for (int i = 0; i < retries; i++) {
            try {
                click(locator);
                return;
            } catch (StaleElementReferenceException e) {
                if (i == retries - 1) throw e;
            }
        }
    }
}
