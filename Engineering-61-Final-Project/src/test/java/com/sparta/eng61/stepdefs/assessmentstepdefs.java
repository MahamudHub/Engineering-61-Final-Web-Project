package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessmentstepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    //DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
//    SendAssessment sendAssessment = new SendAssessment(webDriver);
    @Given("The recruiter chooses a test")
    public void theRecruiterChoosesATest() {
       // sendAssessment.getAssessmentChoice();
    }

    @And("Ticks the Psychometric test")
    public void ticksThePsychometricTest() {
        //Assertions.assertEquals(true, sendAssessment.isSendPsychometricVisible());
    }

    @When("I go to the Dispatches page")
    public void iGoToTheDispatchesPage() {
        loginPage.submitRightCredentials();
        //dispatchesPage.openDispatchesPage();
    }

    @Then("I should see both test types under Assessment type")
    public void iShouldSeeBothTestTypesUnderAssessmentType() {
       // Assertions.assertEquals(sendAssessment.getSentInfo(),dispatchesPage.getAssessmentType());
    }

    @And("Does not tick the Psychometric test")
    public void doesNotTickThePsychometricTest() {
       // Assertions.assertEquals(false, sendAssessment.isSendPsychometricVisible());
    }

    @Then("I should see only one test under Assessment type")
    public void iShouldSeeOnlyOneTestUnderAssessmentType() {
        // Assertions.assertEquals(sendAssessment.getSentInfo(),dispatchesPage.getAssessmentType());
    }

    @Given("The recruiter chooses a Psychometric test")
    public void theRecruiterChoosesAPsychometricTest() {
       // sendAssessment.getPsychometricAssessment();
    }

    @Then("I should see only a Psychometric test under Assessment type")
    public void iShouldSeeOnlyAPsychometricTestUnderAssessmentType() {
       // Assertions.assertEquals("Psychometric",dispatchesPage.getAssessmentType());

    }
}
