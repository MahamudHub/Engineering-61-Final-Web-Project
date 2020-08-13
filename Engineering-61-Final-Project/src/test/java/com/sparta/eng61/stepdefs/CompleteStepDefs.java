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

public class CompleteStepDefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);

    @Given("A candidate has been sent a test")
    public void aCandidateHasBeenSentATest() {
    }

    @When("The candidate has finished the test")
    public void theCandidateHasFinishedTheTest() {
    }

    @When("The candidate has not finished the test")
    public void theCandidateHasNotFinishedTheTest() {
    }

    @And("I go to Dispatches to see if test is complete")
    public void iGoToDispatchesToSeeIfTestIsComplete() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }
    @Then("I should see a Yes under Complete")
    public void iShouldSeeAYesUnderComplete() {
        Assertions.assertEquals("Yes",dispatchesPage.getComplete());

    }

    @Then("I should see a No under Complete")
    public void iShouldSeeANoUnderComplete() {
        Assertions.assertEquals("No",dispatchesPage.getComplete());
    }



}
