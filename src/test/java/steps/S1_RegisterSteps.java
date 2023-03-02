package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P1_RegisterPage;

import java.io.IOException;

public class S1_RegisterSteps extends TestBase {

    public S1_RegisterSteps() throws IOException {
    }

    P1_RegisterPage p1_registerPage = new P1_RegisterPage();

    @Given("user open demoBlaze website with url")
    public void userOpenDemoBlazeWebsiteWithUrl() {
        driver.get(prop.getProperty("url"));
    }

    @And("user navigate to register page")
    public void userNavigateToRegisterPage() {
        p1_registerPage.openSignUpPage();
    }

    @When("user send username and password")
    public void userSendUsernameAndPassword() {
        p1_registerPage.fillSignUpData();
    }

    @And("user click on signup button")
    public void userClickOnSignupButton() {
        p1_registerPage.sendRegisterData();
    }

    @Then("alert of account creation is displayed and user accept that")
    public void alertOfAccountCreationIsDisplayedAndUserAcceptThat() throws InterruptedException {
        p1_registerPage.acceptAlertDialog();
    }

}
