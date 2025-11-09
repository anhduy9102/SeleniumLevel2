package common.drivers;

import org.openqa.selenium.WebDriver;

public class DriverManagerFactory {
    private static DriverManager driverManager;

    public static void initDriver(String browser) {
        if (driverManager == null) {
            driverManager = DriverFactory.getManager(browser);
        }
    }

    public static WebDriver getDriver() {
        if (driverManager == null) {
            throw new IllegalStateException("Driver not initialized! Call initDriver() first.");
        }
        return driverManager.getDriver();
    }

    public static void quitDriver() {
        if (driverManager != null) {
            driverManager.quitDriver();
            driverManager = null;
        }
    }
}
