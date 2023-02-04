package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Allpage {
    WebDriver driver;
    WebDriverWait wait;
    By logout=By.cssSelector(".sidebar-nav > li:nth-child(6) > a:nth-child(1)");
    public Allpage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void logoutButton() {
        WebElement logoutbutton = driver.findElement(logout);
        logoutbutton.click();
        System.out.println(" logout button clicked and we came back to homepage");
    }

}
