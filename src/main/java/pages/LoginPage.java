package pages;

import core.BasePage;
import core.ElementWrapper;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By username    = By.id("username");
    private final By password    = By.id("password");
    private final By loginButton = By.cssSelector("button[name='login']");

    public void login(String user, String pass) {
        ElementWrapper.type(username, user);
        ElementWrapper.type(password, pass);
        ElementWrapper.click(loginButton);
    }
}