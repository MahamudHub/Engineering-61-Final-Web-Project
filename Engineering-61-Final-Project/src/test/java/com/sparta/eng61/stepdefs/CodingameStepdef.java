package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.codingame.CodingamePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingameStepdef {
    WebDriver webDriver = new ChromeDriver();
    CodingamePage codingamePage = new CodingamePage(webDriver);

    @Given("The Candidate has started the test")
    public void IAmOnTheMenuPage() {
        codingamePage.goToStartPage();
    }

    @When("The Candidate clicks on the first question")
    public void ClickOnTheFirstQuestion() {
        codingamePage.clickFirstQuestion();
    }

    @Then("The Candidate can answer the first question")
    public void AnswerTheFirstQuestion() {
        Assertions.assertEquals(true, codingamePage.isFirstQuestionLoading());
    }

    @When("The Candidate clicks on the second question")
    public void ClickOnTheSecondQuestion() {
        codingamePage.clickSecondQuestion();
    }

    @Then("The Candidate can answer the second question")
    public void AnswerTheSecondQuestion() {
        Assertions.assertEquals(true, codingamePage.isSecondQuestionLoading());
    }

    @When("The Candidate clicks on the third question")
    public void ClickOnTheThirdQuestion() {
        codingamePage.clickThirdQuestion();
    }

    @Then("The Candidate can answer the third question")
    public void AnswerTheThirdQuestion() {
        Assertions.assertEquals(true, codingamePage.isThirdQuestionLoading());
    }

    @When("The Candidate clicks on the fourth question")
    public void ClickOnTheFourthQuestion() {
        codingamePage.clickFourthQuestion();
    }

    @Then("The Candidate can answer the fourth question")
    public void AnswerTheFourthQuestion() {
        Assertions.assertEquals(true, codingamePage.isFourthQuestionLoading());
    }

    @When("The Candidate is satisfied with his answers")
    public void ClickSubmit() {
        codingamePage.submitAssessment();
    }

    @Then("The Candidate submits the test")
    public void TheTestWillBeSubmitted() {
        Assertions.assertEquals(true, codingamePage.isSubmitWorking());
    }
}
