package core;

import common.drivers.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManagerFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
}
