package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class expiredStepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);

    @Given("A candidate has been sent a test {int} days ago")
    public void aCandidateHasBeenSentATestDaysAgo(int arg0) {
    }

    @When("The candidate has submitted the test")
    public void theCandidateHasSubmittedTheTest() {
    }

    @When("The candidate has not submitted the test")
    public void theCandidateHasNotSubmittedTheTest() {
    }
    @And("I go to the dispatches page")
    public void iGoToTheDispatchesPage() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }
    @Then("I should see a No under Expired")
    public void iShouldSeeANoUnderExpired() {
        Assertions.assertEquals("No",dispatchesPage.getExpired());
    }

    @Then("I should see a Yes under Expired")
    public void iShouldSeeAYesUnderExpired() {
        Assertions.assertEquals("Yes",dispatchesPage.getExpired());
    }
}
