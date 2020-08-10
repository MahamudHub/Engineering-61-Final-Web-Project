package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.PollsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PollStepDefs {
    WebDriver webDriver = new ChromeDriver();
    PollsPage pollsPage = new PollsPage(webDriver);

    @Given("I have to have sent a candidate an assessment")
    public void iHaveToHaveSentACandidateAnAssessment() {
    }

    @When("I check the candidate assessment status.")
    public void iCheckTheCandidateAssessmentStatus() {
    }

    @Then("it will show the current state")
    public void itWillShowTheCurrentState() {
        Assertions.assertEquals(true, pollsPage.getAssessmentStatus());
    }

    @Given("I have updated the poll on the results page")
    public void iHaveUpdatedThePollOnTheResultsPage() {
    }

    @And("the poll has not updated automatically")
    public void thePollHasNotUpdatedAutomatically() {
    }

    @When("I check the time of the last poll")
    public void iCheckTheTimeOfTheLastPoll() {
    }

    @Then("it will be the same as when I updated the poll")
    public void itWillBeTheSameAsWhenIUpdatedThePoll() {
        Assertions.assertEquals(true, pollsPage.getPollTime());

    }

    @Given("I have sent the candidate an assessment")
    public void iHaveSentTheCandidateAnAssessment() {
    }

    @When("I go on the poll page")
    public void iGoOnThePollPage() {
    }

    @Then("I will see the TestID")
    public void iWillSeeTheTestID() {
        Assertions.assertEquals(true, pollsPage.getTestId());
    }

    @Then("I will see the email address of the candidate")
    public void iWillSeeTheEmailAddressOfTheCandidate() {
        Assertions.assertEquals(true, pollsPage.getCandidateEmail());

    }
}
