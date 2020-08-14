package com.sparta.eng61.stepdefs;

import com.sparta.eng61.helpers.WebDriverFactory;
import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendAssessmentsStepdefs {
    WebDriver webDriver = WebDriverFactory.SelectDriver("Chrome");
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);

    @Given("I have to contact a candidate to send an assessment")
    public void iHaveToContactACandidateToSendAnAssessment() {
    }

    @When("I'm on the Send Assessment page")
    public void iMOnTheSendAssessmentPage() {
        sendAssessmentPage.openSendAssessmentPage();
    }

    @Then("I will see a placeholder in the field to enter candidate name.")
    public void iWillSeeAPlaceholderInTheFieldToEnterCandidateName() {
        Assertions.assertEquals(true,sendAssessmentPage.isCandidateNamePlaceholderCorrect());

    }

    @Then("I will see a placeholder in the field to enter candidate email")
    public void iWillSeeAPlaceholderInTheFieldToEnterCandidateEmail() {
        Assertions.assertEquals(true,sendAssessmentPage.isCandidateEmailPlaceholderCorrect());
    }

    @Then("I will be a placeholder in the field to enter recruiter email")
    public void iWillBeAPlaceholderInTheFieldToEnterRecruiterEmail() {
        Assertions.assertEquals(true,sendAssessmentPage.isRecruiterEmailPlaceholderCorrect());
    }


    @When("I select Psychometric Assessment")
    public void iSelectPsychometricAssessment() {
        sendAssessmentPage.selectPsychometricAssessment();
    }

    @Then("there will not be a checkbox to send Psychometric Assessment")
    public void thereWillNotBeACheckboxToSendPsychometricAssessment() {
        Assertions.assertEquals(true,sendAssessmentPage.isSendPsychometricVisible());
    }

    @Given("I have to sent the candidate an assessment need to select the assessment")
    public void iHaveToSentTheCandidateAnAssessmentNeedToSelectTheAssessment() {
    }

    @When("I see a dropdown list i should see the number of assessments")
    public void iSeeADropdownListIShouldSeeTheNumberOfAssessments() {
        sendAssessmentPage.getNumberOfAssessmentChoices();
    }

    @Then("there will not be five assessments to select from")
    public void thereWillNotBeFiveAssessmentsToSelectFrom() {
        Assertions.assertEquals(5, sendAssessmentPage.getNumberOfAssessmentChoices());
    }

    @Given("I have filled all the fields to send assessment")
    public void iHaveFilledAllTheFieldsToSendAssessment() {
        sendAssessmentPage.enterFields();
    }

    @Then("the submit will be visible to send assessment to the candidate.")
    public void theSubmitWillBeVisibleToSendAssessmentToTheCandidate() {
        Assertions.assertEquals("Assessment Sent", sendAssessmentPage.getPageHeader());
    }

    @Given("I have to send the candidate an assessment")
    public void iHaveToSendTheCandidateAnAssessment() {
    }

    @When("I entered the candidate name")
    public void iEnteredTheCandidateName() {
    }

    @Then("i click submit i will see candidate name on Assessment Sent")
    public void iClickSubmitIWillSeeCandidateNameOnAssessmentSent() {
        Assertions.assertEquals(true,sendAssessmentPage.isSentInfoIncludeName());
    }

    @When("I entered candidate email")
    public void iEnteredCandidateEmail() {
    }

    @Then("i click submit i will see candidate email on Assessment Sent")
    public void iClickSubmitIWillSeeCandidateEmailOnAssessmentSent() {
        Assertions.assertEquals(true,sendAssessmentPage.isSentInfoIncludeEmail());
    }

    @When("I entered candidate details")
    public void iEnteredCandidateDetails() {
        loginPage.login();
        sendAssessmentPage.enterFieldsToSendAssessment();
    }
    @Then("i click submit i will send the candidate an Assessment")
    public void iClickSubmitIWillSendTheCandidateAnAssessment() {
        Assertions.assertEquals("Assessment Sent", sendAssessmentPage.getPageHeader());
    }
}
