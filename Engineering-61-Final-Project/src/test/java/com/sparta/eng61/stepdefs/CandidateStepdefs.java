package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandidateStepdefs {
    WebDriver webDriver = new ChromeDriver();
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);

    @Given("A candidate has been contacted")
    //------Method needed from Mohamed's class
    public void aCandidateHasBeenContacted() {
    }
    @When("I go to Dispatches to see Candidate details")
    public void iGoToDispatchesToSeeCandidateDetails() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }


    @Then("I should see their name")
    public void iShouldSeeTheirName() {
        iGoToDispatchesToSeeCandidateDetails();
        Assertions.assertEquals(sendAssessmentPage.isSentInfoIncludeName(),dispatchesPage.getCandidateName());
    }

    @Then("I should see their email")
    public void iShouldSeeTheirEmail() {
        iGoToDispatchesToSeeCandidateDetails();
        Assertions.assertEquals(sendAssessmentPage.isSentInfoIncludeEmail(),dispatchesPage.getCandidateEmail());
    }


}
