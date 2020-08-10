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

    @Given("I have sent the candidate an assessment")
    public void iHaveSentTheCandidateAnAssessment() {

    }

    @And("The candidate has completed the assessment")
    public void theCandidateHasCompletedTheAssessment () {

    }

    @Given("I have updated the poll on the results page")
    public void iHaveUpdatedThePollOnTheResultsPage() {

    }

    @And("the poll has not updated automatically")
    public void thePollHasNotUpdatedAutomatically() {
        Assertions.assertEquals(false, pollsPage.isPollTimeUpdatingAutomatically());
    }

    @When("I check the time of the last poll")
    public void iCheckTheTimeOfTheLastPoll() {
    }

    @Then("it will be the same as when I updated the poll")
    public void itWillBeTheSameAsWhenIUpdatedThePoll() {
        Assertions.assertEquals(true, pollsPage.getPollTime());
    }

    @When("I go on the poll page")
    public void iGoOnThePollPage() {
        pollsPage.openPollsPage();
    }

    @Then("I will see the TestID")
    public void iWillSeeTheTestID() {
        Assertions.assertEquals(true, pollsPage.getTestId());
    }

    @Then("I will see the email address of the candidate")
    public void iWillSeeTheEmailAddressOfTheCandidate() {
        Assertions.assertEquals(true, pollsPage.getCandidateEmail());

    }

    @Then("The status will say waiting")
    public void theStatusWillSayWaiting() {
        Assertions.assertEquals("Waiting", pollsPage.getAssessmentStatus());
    }


    @Then("The status will say completed")
    public void theStatusWillSayCompleted() {
        Assertions.assertEquals("Completed", pollsPage.getAssessmentStatus());

    }

    @And("The time has expired")
    public void theTimeHasExpired() {

    }

    @Then("The status will say expired")
    public void theStatusWillSayExpired() {
    }
}
