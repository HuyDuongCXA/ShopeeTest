package notepad;

import constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utilities;

public class GeneralPage {

    public static WebElement getElement(String locator){
        Utilities.waitForElementDisplayed(locator);
        return Constant.WEBDRIVER.findElement(By.xpath(locator));
    }


}
