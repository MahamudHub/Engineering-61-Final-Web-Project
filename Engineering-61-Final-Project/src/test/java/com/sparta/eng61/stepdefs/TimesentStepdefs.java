package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimesentStepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    @Given("A test was sent to a candidate")
    public void aTestWasSentToACandidate() {
    }

    @When("I go to the dispatches page to see time sent")
    public void iGoToTheDispatchesPageToSeeTimeSent() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }

    @Then("I should see the time the test was sent")
    public void iShouldSeeTheTimeTheTestWasSent() {
        iGoToTheDispatchesPageToSeeTimeSent();
        Assertions.assertEquals("August 8th 2020, 4:46:38 pm",dispatchesPage.getTimeSent());

    }


}
