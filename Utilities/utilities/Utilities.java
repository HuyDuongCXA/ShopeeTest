package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.Constant;

public class Utilities {

    public static String getProjectPath() {
        return System.getProperty("user.dir").toString();
    }


    public static void waitForElementDisplayed(String locator) {
        WebDriverWait wait = new WebDriverWait(Constant.WEBDRIVER, Constant.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public static void setImplicitlyWait(int timeOutInSecond) {
        Constant.WEBDRIVER.manage().timeouts().implicitlyWait(timeOutInSecond, TimeUnit.SECONDS);
    }

}

