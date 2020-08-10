package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.PollsPage;
import com.sparta.eng61.pageobjects.dispatcher.ResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsStepDefs {
    WebDriver webDriver = new ChromeDriver();
    ResultsPage resultsPage = new ResultsPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    PollsPage pollsPage = new PollsPage(webDriver);


    // Scenario
    @Given("I have sent the candidate an assessment")
    public void iHaveSentTheCandidateAnAssessment() {
    }

    @When("I check the score of the assessment")
    public void iCheckTheScoreOfTheAssessment() {
    }

    @Then("The score is displayed")
    public void theScoreIsDisplayed() {
        Assertions.assertEquals(true, resultsPage.getCandidateScore());
    }

    @Given("I am on the results page")
    public void iAmOnTheResultsPage() {
    }

    @When("I see the candidates email")
    public void iSeeTheCandidatesEmail() {
    }

    @Then("It should be the same as the dispatch page")
    public void itShouldBeTheSameAsTheDispatchPage() {
        Assertions.assertEquals(resultsPage.getCandidateEmail(), dispatchesPage.getCandidateEmail());
    }

    @Then("I should see the name of the candidate")
    public void iShouldSeeTheNameOfTheCandidate() {
        Assertions.assertEquals(true, resultsPage.getCandidateName());
    }

    //Given i am on the results page

    @When("I look at the NR Column")
    public void iLookAtTheNRColumn() {
    }

    @Then("I should see the candidate NR")
    public void iShouldSeeTheCandidateNR() {
        Assertions.assertEquals(true, resultsPage.getCandidateNR());
    }

    //Given i am on the results page

    @When("I look at the LR Column")
    public void iLookAtTheLRColumn() {
    }


    @Then("I should see the candidate LR")
    public void iShouldSeeTheCandidateLR() {
        Assertions.assertEquals(true, resultsPage.getCandidateLR());
    }

    //Scenario

    @Given("The update button is displayed")
    public void theUpdateButtonIsDisplayed() {
    }

    @When("I click the update button")
    public void iClickTheUpdateButton() {
    }

    @Then("I should see the polls page")
    public void iShouldSeeThePollsPage() {
        Assertions.assertEquals(true, resultsPage.getUpdateButtonTest());
    }
}
