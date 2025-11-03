package common.drivers;

import common.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            driver.set(initDriver());
        }
        return driver.get();
    }

    private static WebDriver initDriver() {
        String browser = ConfigReader.get("browser").toLowerCase();
        boolean headless = Boolean.parseBoolean(ConfigReader.get("headless"));

        switch (browser) {
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions fopt = new FirefoxOptions();
                if (headless) fopt.addArguments("--headless");
                return new org.openqa.selenium.firefox.FirefoxDriver(fopt);
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                EdgeOptions eopt = new EdgeOptions();
                if (headless) eopt.addArguments("--headless");
                return new org.openqa.selenium.edge.EdgeDriver(eopt);
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                ChromeOptions copt = new ChromeOptions();
                if (headless) copt.addArguments("--headless=new");
                return new org.openqa.selenium.chrome.ChromeDriver(copt);
            }
        }
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
