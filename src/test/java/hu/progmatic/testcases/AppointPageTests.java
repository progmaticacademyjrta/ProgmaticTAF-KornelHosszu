package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppointPageTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    @Test(description = "TC:04 Appointment from loaded and works")
    public void validAppointmentTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentPage = new AppointmentPage(driver, wait);
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
        Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/appointment.php#summary",driver.getCurrentUrl());
    }
}
