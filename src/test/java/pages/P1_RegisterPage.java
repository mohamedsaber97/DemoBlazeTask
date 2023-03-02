package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class P1_RegisterPage extends TestBase {
    public P1_RegisterPage() throws IOException {
    }

    By homeSignupBtn = By.id("signin2");
    By userNameTxt = By.id("sign-username");
    By passwordTxt = By.id("sign-password");
    By registerBtn = By.xpath("//*[@onclick = 'register()']");


    public void openSignUpPage() {
        WebElement homeSignupBtnElement = driver.findElement(homeSignupBtn);
        homeSignupBtnElement.click();
    }

    public void fillSignUpData() {
        WebElement userNameTxtElement = driver.findElement(userNameTxt);
        userNameTxtElement.sendKeys(prop.getProperty("username"));
        WebElement passwordTxtElement = driver.findElement(passwordTxt);
        passwordTxtElement.sendKeys(prop.getProperty("password"));
    }

    public void sendRegisterData() {
        WebElement registerBtnElement = driver.findElement(registerBtn);
        registerBtnElement.click();
    }

    public void acceptAlertDialog() throws InterruptedException {
        Thread.sleep(2000);
        String alertMsg = driver.switchTo().alert().getText();
        System.out.println("-----new account status is : " + alertMsg);
        driver.switchTo().alert().accept();
    }
}
