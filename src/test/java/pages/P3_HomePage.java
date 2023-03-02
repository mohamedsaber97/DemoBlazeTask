package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class P3_HomePage extends TestBase {
    public P3_HomePage() throws IOException {
    }

    By categoriesList = By.className("list-group-item");
    By itemLink = By.linkText("Samsung galaxy s6");
    By addToCartBtn = By.xpath("//*[@onclick = 'addToCart(1)']");
    By headerCartBtn = By.linkText("Cart");
    By deleteBtn = By.linkText("Delete");
    By placeOrderBtn = By.xpath("//*[text() = 'Place Order']");
    By nameTxt = By.id("name");
    By countryTxt = By.id("country");
    By cityTxt = By.id("city");
    By cardTxt = By.id("card");
    By monthTxt = By.id("month");
    By yearTxt = By.id("year");
    By purchaseBtn = By.xpath("//*[@onclick = 'purchaseOrder()']");
    By thanksMsg = By.xpath("/html/body/div[10]/h2");
    By okBtn = By.xpath("//*[text() = 'OK']");


    public void chooseCategoryAndCheckItsItems() {
        List<WebElement> categoriesListElements = driver.findElements(categoriesList);
        if (!categoriesListElements.isEmpty()) {
            categoriesListElements.get(1).click();
            String selectedCategory = categoriesListElements.get(1).getText();
            System.out.println("-----selected category is " + selectedCategory + "-----");
        } else {
            System.out.println("-----there is no categories-----");
        }
        WebElement itemLinkElement = driver.findElement(itemLink);
        boolean phoneItem = itemLinkElement.isDisplayed();
        Assert.assertTrue(phoneItem, "-----phone category has no items-----");
        System.out.println("-----phones category has item called " + itemLinkElement.getText() + "-----");
    }

    public void addRandomItemToCart() {
        WebElement itemLinkElement = driver.findElement(itemLink);
        itemLinkElement.click();
        WebElement addToCartBtnElement = driver.findElement(addToCartBtn);
        addToCartBtnElement.click();
    }

    public void acceptAddedAlertDialog() throws InterruptedException {
        Thread.sleep(2000);
        String alertMsg = driver.switchTo().alert().getText();
        System.out.println("-----item status is : " + alertMsg + "-----");
        driver.switchTo().alert().accept();
    }

    public void openCartPage() {
        WebElement headerCartBtnElement = driver.findElement(headerCartBtn);
        headerCartBtnElement.click();
    }

    public void deleteCartItem() {
        WebElement deleteBtnElement = driver.findElement(deleteBtn);
        deleteBtnElement.click();
    }

    public void clickPlaceOrder() {
        WebElement placeOrderBtnElement = driver.findElement(placeOrderBtn);
        placeOrderBtnElement.click();
    }

    public void fillAndSaveOrderInfo() {
        WebElement nameTxtElement = driver.findElement(nameTxt);
        nameTxtElement.sendKeys("mohamed saber");
        WebElement countryTxtElement = driver.findElement(countryTxt);
        countryTxtElement.sendKeys("egypt");
        WebElement cityTxtElement = driver.findElement(cityTxt);
        cityTxtElement.sendKeys("mansoura");
        WebElement cardTxtElement = driver.findElement(cardTxt);
        cardTxtElement.sendKeys("1234567890123456");
        WebElement monthElement = driver.findElement(monthTxt);
        monthElement.sendKeys("4");
        WebElement yearTxtElement = driver.findElement(yearTxt);
        yearTxtElement.sendKeys("1997");
        WebElement purchaseBtnElement = driver.findElement(purchaseBtn);
        purchaseBtnElement.click();
    }

    public void verifyInvoiceDialogAndAccept() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        WebElement thanksMsgElement = driver.findElement(thanksMsg);
        boolean thanks = thanksMsgElement.isDisplayed();
        softAssert.assertTrue(thanks, "-----order not completed-----");
        System.out.println("-----order status is " + thanksMsgElement.getText() + "-----");
        WebElement okBtnElement = driver.findElement(okBtn);
        okBtnElement.click();
    }
}
