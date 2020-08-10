package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssessmentStepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    @Given("The recruiter chooses a test")
    public void theRecruiterChoosesATest() {
        sendAssessmentPage.selectJavaAssessment();
    }

    @And("Ticks the Psychometric test")
    public void ticksThePsychometricTest() {
        Assertions.assertEquals(true, sendAssessmentPage.isSendPsychometricVisible());
    }

    @When("I go to the Dispatches page")
    public void iGoToTheDispatchesPage() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }

    @Then("I should see both test types under Assessment type")
    public void iShouldSeeBothTestTypesUnderAssessmentType() {
        Assertions.assertEquals(sendAssessmentPage.getSentInfo(),dispatchesPage.getAssessmentType());
    }

    @And("Does not tick the Psychometric test")
    public void doesNotTickThePsychometricTest() {
        Assertions.assertEquals(false, sendAssessmentPage.isSendPsychometricVisible());
    }

    @Then("I should see only one test under Assessment type")
    public void iShouldSeeOnlyOneTestUnderAssessmentType() {
         Assertions.assertEquals(sendAssessmentPage.getSentInfo(),dispatchesPage.getAssessmentType());
    }

    @Given("The recruiter chooses a Psychometric test")
    public void theRecruiterChoosesAPsychometricTest() {
        sendAssessmentPage.getPsychometricAssessment();
    }

    @Then("I should see only a Psychometric test under Assessment type")
    public void iShouldSeeOnlyAPsychometricTestUnderAssessmentType() {
        Assertions.assertEquals("Psychometric",dispatchesPage.getAssessmentType());

    }
}
