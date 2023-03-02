package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P2_LoginPage;

import java.io.IOException;

public class S2_LoginSteps {
    public S2_LoginSteps() throws IOException {
    }

    P2_LoginPage p2_loginPage = new P2_LoginPage();

    @And("user navigate to login page")
    public void userNavigateToLoginPage() {
        p2_loginPage.openLoginPage();
    }

    @When("user send login username and password")
    public void userSendLoginUsernameAndPassword() {
        p2_loginPage.fillLoginData();
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        p2_loginPage.sendLoginData();
    }

    @Then("home page is opened and welcome text is displayed")
    public void homePageIsOpenedAndWelcomeTextIsDisplayed() throws InterruptedException {
        p2_loginPage.verifyHomePage();
    }
}
