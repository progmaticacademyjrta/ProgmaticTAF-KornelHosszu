package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;

import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    @Test(description = "TC03:Try to login with wrong Username and wrong Password")
    public void invalidUsernameInvalidPasswordTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        homePage.loadHomePage();
        homePage.makeAppmointmentButton();
        loginPage.invalidUsername();
        loginPage.InvalidPassword();
        loginPage.loginbutton();
    }
}
