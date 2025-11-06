package tests;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserLaunchTest extends BaseTest {

    @Test
    public void testOpenGoogleHomePage() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        System.out.println("Opened browser title: " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle),
                "Expected title to contain '" + expectedTitle + "', but got '" + actualTitle + "'");
    }
}
