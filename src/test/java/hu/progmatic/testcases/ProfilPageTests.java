package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    ProfilPage profilPage;
    @Test(description = "TC05: Profil page succefully load and works properly")
    public void profilPageTest()throws InterruptedException{
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver, wait);
        profilPage= new ProfilPage(driver,wait);
        homePage.loadHomePage();
        homePage.makeAppmointmentButton();
        appointmentPage.validUsername();
        appointmentPage.validPassword();
        appointmentPage.loginbutton();
        profilPage.menuButton();
        profilPage.profilPageButton();
    }

}
