package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndtoEndTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    ProfilPage profilPage;
    Allpage allpage;
    @Test(description = "TC06: End to End test for that includes all features of the site")
    public void allFunctionTest()throws InterruptedException{
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver, wait);
        profilPage= new ProfilPage(driver,wait);
        allpage= new Allpage(driver,wait);
        homePage.loadHomePage();
        homePage.makeAppmointmentButton();
        appointmentPage.validUsername();
        appointmentPage.validPassword();
        appointmentPage.loginbutton();
        appointmentPage.facilitychoose();
        appointmentPage.hospitalReadmissionCheckbox();
        appointmentPage.heltCareProgramRadioButton();
        appointmentPage.visitDateLine();
        appointmentPage.commentTextBox();
        appointmentPage.bookAppointmentButton();
        profilPage.menuButton();
       Thread.sleep(4000);
        allpage.logoutButton();
        Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/",driver.getCurrentUrl());
    }
}
