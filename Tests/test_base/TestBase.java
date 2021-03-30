package test_base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constant.Constant;
import utilities.Utilities;

public class TestBase {
    Logger logger = LogManager.getLogger(TestBase.class);

    @BeforeMethod
    public void beforeMethod() {
        logger.info("Pre-condition");
        String os = System.getProperty("os.name");

        if (os.equals("Mac OS X")){
            System.setProperty("webdriver.chrome.driver",
                    Utilities.getProjectPath() + "/Executables/chromedriver");
        }

        else{System.setProperty("webdriver.chrome.driver",
                Utilities.getProjectPath() + "/Executables/chromedriver.exe");}

        Constant.WEBDRIVER.navigate().to(Constant.AUT_URL);
        Utilities.setImplicitlyWait(Constant.TIMEOUT);
        Constant.WEBDRIVER.manage().window().maximize();
        Utilities.setImplicitlyWait(Constant.TIMEOUT);

    }

    @AfterMethod
    public void afterMethod() {
        logger.info("Post-condition");
        Constant.WEBDRIVER.quit();
    }

}

