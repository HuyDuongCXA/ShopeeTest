package notepad;

import login.LoginInfo;
import utilities.Utilities;

public class LoginPage extends GeneralPage {
    //Locators

    private final String ENTER_EMAIL_TXT = "//input[@id='loginEmail']";
    private final String ENTER_PASSWORD_TXT ="//input[@placeholder='Enter Password']";
    private final String LOGIN_BTN = "//input[@value='login']//parent::form//button[@id='submit']";

    //Methods

    public void enterEmail(LoginInfo loginInfo){
        Utilities.waitForElementDisplayed(ENTER_EMAIL_TXT);
        getElement(ENTER_EMAIL_TXT).sendKeys(loginInfo.getEmail());
    }

    public void enterPassword(LoginInfo loginInfo){
        Utilities.waitForElementDisplayed(ENTER_PASSWORD_TXT);
        getElement(ENTER_PASSWORD_TXT).sendKeys(loginInfo.getPassword());
    }

    public void login(LoginInfo loginInfo){
        this.enterEmail(loginInfo);
        this.enterPassword(loginInfo);
        getElement(LOGIN_BTN).click();
    }








}
