package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilPage {
    WebDriver driver;
    WebDriverWait wait;
    By menubutton=By.id("menu-toggle");
    By profilbutton= By.cssSelector(".sidebar-nav > li:nth-child(5) > a:nth-child(1)");
    By logout=By.cssSelector(".btn-default");
    public ProfilPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void menuButton(){
        WebElement sideMenuButton= driver.findElement(menubutton);
        sideMenuButton.click();
        System.out.println("Menu button clicked ");
    }
    public void profilPageButton() throws InterruptedException{
        WebElement profilMenuButton= driver.findElement(profilbutton);
        profilMenuButton.click();
        WebElement logoutbutton= driver.findElement(logout);
        Assert.assertTrue(logoutbutton.isDisplayed());
        System.out.println("Menubar profil button clicked logout button displayed");
    }
    public void profilPagelogoutButton() {
        WebElement logoutbutton= driver.findElement(logout);
        logoutbutton.click();
        System.out.println("Profil page logout button clicked and works");
    }
}
