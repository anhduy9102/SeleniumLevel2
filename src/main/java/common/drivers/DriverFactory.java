package common.drivers;

public class DriverFactory {

    public static DriverManager getManager(String browser) {
        return switch (browser.toLowerCase()) {
            case "firefox" -> new FirefoxManager();
            case "edge" -> new EdgeManager();
            default -> new ChromeManager();
        };
    }
}
