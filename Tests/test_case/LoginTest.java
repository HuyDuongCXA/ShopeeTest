package test_case;

import login.LoginInfo;
import notepad.HomePage;
import notepad.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void TC01(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        LoginInfo loginInfo = new LoginInfo();
        String expected = "Logout";

        homePage.goToLoginPage();
        loginPage.login(loginInfo);
        String actual = homePage.getLogoutText();
        Assert.assertEquals(actual,expected);
    }
}
