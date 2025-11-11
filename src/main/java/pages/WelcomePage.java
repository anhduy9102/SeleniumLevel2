package pages;

import core.BasePage;
import core.ElementWrapper;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {

    private final By shopNowButton = By.xpath("//button[contains(text(),'Shop Now')]");
    private final By welcomeTitle = By.xpath("//h1[contains(text(),'Welcome')]");

    public boolean isLoaded() {
        return ElementWrapper.isVisible(welcomeTitle);
    }

    public void gotoShop() {
        ElementWrapper.click(shopNowButton);
    }
}
