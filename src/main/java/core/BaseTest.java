package core;

import common.drivers.DriverFactory;
import common.drivers.DriverManager;
import common.utils.ConfigReader;
import common.utils.EnvReader;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    private DriverManager driverManager;

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.get("browser");
        String BASE_URL = EnvReader.get("BASE_URL");
        driverManager = DriverFactory.getManager(browser);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        if (driverManager != null) {
            driverManager.quitDriver();
        }
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
