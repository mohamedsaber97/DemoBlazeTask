package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class P2_LoginPage extends TestBase {
    public P2_LoginPage() throws IOException {
    }

    By homeLoginBtn = By.id("login2");

    By userNameTxt = By.id("loginusername");
    By passwordTxt = By.id("loginpassword");
    By loginBtn = By.xpath("//*[@onclick = 'logIn()']");

    By welcomeTxt = By.id("nameofuser");

    public void openLoginPage() {
        WebElement homeLoginBtnElement = driver.findElement(homeLoginBtn);
        homeLoginBtnElement.click();
    }

    public void fillLoginData() {
        WebElement userNameTxtElement = driver.findElement(userNameTxt);
        userNameTxtElement.sendKeys(prop.getProperty("username"));
        WebElement passwordTxtElement = driver.findElement(passwordTxt);
        passwordTxtElement.sendKeys(prop.getProperty("password"));
    }

    public void sendLoginData() {
        WebElement loginBtnElement = driver.findElement(loginBtn);
        loginBtnElement.click();
    }

    public void verifyHomePage() throws InterruptedException {
        Thread.sleep(2000);
        WebElement welcomeTxtElement = driver.findElement(welcomeTxt);
        boolean welcome = welcomeTxtElement.isDisplayed();
        Assert.assertTrue(welcome, "-----login failed-----");
        System.out.println("-----successful login " + welcomeTxtElement.getText() + "-----");
    }
}
