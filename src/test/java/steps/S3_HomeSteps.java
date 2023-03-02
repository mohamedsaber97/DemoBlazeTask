package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P3_HomePage;

import java.io.IOException;

public class S3_HomeSteps {

    public S3_HomeSteps() throws IOException {
    }

    P3_HomePage p3_homePage = new P3_HomePage();

    @And("user click on phones category and check item display")
    public void userClickOnPhonesCategoryAndCheckItemDisplay() {
        p3_homePage.chooseCategoryAndCheckItsItems();
    }

    @When("user click on random item and add it to cart")
    public void userClickOnRandomItemAndAddItToCart() {
        p3_homePage.addRandomItemToCart();
    }

    @Then("alert of item added is displayed and user accept that")
    public void alertOfItemAddedIsDisplayedAndUserAcceptThat() throws InterruptedException {
        p3_homePage.acceptAddedAlertDialog();
    }

    @And("user navigate to cart page")
    public void userNavigateToCartPage() {
        p3_homePage.openCartPage();
    }

    @And("user delete item from cart")
    public void userDeleteItemFromCart() {
        p3_homePage.deleteCartItem();
    }

    @And("user click on place order button")
    public void userClickOnPlaceOrderButton() {
        p3_homePage.clickPlaceOrder();
    }

    @And("user fill all order information and click on purchase button")
    public void userFillAllOrderInformationAndClickOnPurchaseButton() {
        p3_homePage.fillAndSaveOrderInfo();
    }

    @Then("order invoice is displayed and user click on ok button")
    public void orderInvoiceIsDisplayedAndUserClickOnOkButton() throws InterruptedException {
        p3_homePage.verifyInvoiceDialogAndAccept();
    }
}
