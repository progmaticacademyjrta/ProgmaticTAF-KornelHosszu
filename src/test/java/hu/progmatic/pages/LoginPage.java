package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.SQLOutput;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    By userNameLine = By.name("username");
    By passwordLine = By.name("password");
    By login = By.id("btn-login");

    By message = By.xpath("/html/body/section/div/div/div[1]/p[2]");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void invalidUsername() {
        WebElement userNameInput = driver.findElement(userNameLine);
        userNameInput.sendKeys("Dwight Schrute");
        System.out.println("Invalid username added");
    }

    public void InvalidPassword() {

        WebElement passwordInput = driver.findElement(passwordLine);
        passwordInput.sendKeys("BattlestarGalactica");
        System.out.println("Invalid password added");
    }

    public void loginbutton() {
        WebElement loginButton = driver.findElement(login);
        loginButton.click();

        WebElement webmessage = driver.findElement(message);
        Assert.assertEquals(webmessage.getText(), "Login failed! Please ensure the username and password are valid.");

        System.out.println("failed login message displayed");
    }


}
