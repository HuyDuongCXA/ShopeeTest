package notepad;

import utilities.Utilities;

public class HomePage extends GeneralPage {

    //Locator
    private final String REGISTER_LOGIN_LINK = "//ul[@class='nav nav-pills']//a[@href='/create_account']";
    private final String LOGOUT_LINK = "//a[@href='/logout']";

    //Methods
    public void goToLoginPage(){
        getElement(REGISTER_LOGIN_LINK).click();
    }
    public String getLogoutText(){
        Utilities.waitForElementDisplayed(LOGOUT_LINK);
        return getElement(LOGOUT_LINK).getText();
    }

}
