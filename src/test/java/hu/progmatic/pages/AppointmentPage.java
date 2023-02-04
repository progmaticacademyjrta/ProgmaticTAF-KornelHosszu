package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.SQLOutput;


public class AppointmentPage {
    WebDriver driver;
    WebDriverWait wait;

    By userNameLine = By.name("username");
    By passwordLine = By.name("password");
    By login = By.id("btn-login");

    By facilitydrop = By.name("facility");
    By readcheckbox = By.cssSelector("#chk_hospotal_readmission");

    By radiobutton = By.id("radio_program_medicaid");

    By visitDate = By.xpath("//*[@id=\"txt_visit_date\"]");

    By textbox = By.cssSelector("#txt_comment");

    By appointbutton= By.id("btn-book-appointment");


    public AppointmentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void validUsername() {
        WebElement userNameInput = driver.findElement(userNameLine);
        userNameInput.sendKeys("John Doe");
        System.out.println("valid username added");
    }

    public void validPassword() {

        WebElement passwordInput = driver.findElement(passwordLine);
        passwordInput.sendKeys("ThisIsNotAPassword");
        System.out.println("valid password added");
    }

    public void loginbutton() {
        WebElement loginButton = driver.findElement(login);
        loginButton.click();
        System.out.println("Login was perfect");
    }

    public void facilitychoose() {
        WebElement facilityDropdown = driver.findElement(facilitydrop);
        facilityDropdown.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        System.out.println("third option properly selected ");

    }

    public void hospitalReadmissionCheckbox() {
        WebElement readMissioncheckbox = driver.findElement(readcheckbox);
        readMissioncheckbox.click();
        System.out.println("Checkbox works and clicked");
    }

    public void heltCareProgramRadioButton() {
        WebElement medicaidRadiobutton = driver.findElement(radiobutton);
        medicaidRadiobutton.click();
        System.out.println("Medicaid radiobutton choosed");
    }

    public void visitDateLine() {
        WebElement visitDateInputField = driver.findElement(visitDate);
        visitDateInputField.click();
        visitDateInputField.sendKeys("09//09//2023");
        System.out.println("Visitdate added  with valid fromat (09//09//2023)");
    }

    public void commentTextBox() {
        WebElement textboxArea = driver.findElement(textbox);
        textboxArea.sendKeys(Keys.ENTER);
        textboxArea.sendKeys("I would like to make an appointment immediately.Thank you!");
        System.out.println("Text area works properly");
    }
    public void bookAppointmentButton(){
        WebElement appointmentButton= driver.findElement(appointbutton);
        appointmentButton.click();
        System.out.println("Book Appointment button clicked ");
    }

}
