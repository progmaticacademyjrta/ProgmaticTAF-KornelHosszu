package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;

import hu.progmatic.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;
    @Test(groups ="Smoke Test",description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }
    @Test(description = "TC02: Make Appointment button clickable and works")
    public void MakeAppoitmentButtonTest() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        homePage.makeAppmointmentButton();
        Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/profile.php#login", driver.getCurrentUrl());
    }
}
