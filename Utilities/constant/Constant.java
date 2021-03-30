package constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constant {

    public static WebDriver WEBDRIVER = new ChromeDriver();
    public static final int SHORT_TIMEOUT = 1;
    public static final int TIMEOUT = 30;
    public static final int LONG_TIMEOUT = 60;
    public static final String AUT_URL = "https://anotepad.com/";
}