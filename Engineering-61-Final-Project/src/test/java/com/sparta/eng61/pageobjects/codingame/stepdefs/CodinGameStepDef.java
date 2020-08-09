package com.sparta.eng61.pageobjects.codingame.stepdefs;

import com.sparta.eng61.pageobjects.codingame.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodinGameStepDef {
    WebDriver webDriver = new ChromeDriver();
    StartPage startPage = new StartPage(webDriver);

    @Given("I open the Codingame link")
    public void IOpenTheCodingameLink() {
        startPage.goToStartPage();
    }

    @When("I click the Start button")
    public void IClickTheStartButton() {
        startPage.clickStartButton();
    }

    @Then("The test will start")
    public void TheTestWillStart() {
        Assertions.assertTrue(startPage.readStartPage());
    }

    @Given("I am on the menu page")
    public void IAmOnTheMenuPage() {
        startPage.doFirstQuestion();
    }

    @When("I click on the required question")
    public void IClickOnTheRequiredQuestion() {
        startPage.answerFirstQ();
    }

    @Then("I will be prompted to the required question")
    public void IWillBePromptedToTheRequiredQuestion() {
        Assertions.assertTrue(startPage.readFirstQuestion());
    }

    @Given("I have to submit my test")
    public void IHaveToSubmitMyTest() {
        startPage.submitAssessment();
    }

    @When("I click submit")
    public void IClickSubmit() {
        startPage.submitAnswers();
    }

    @Then("The test will be submitted")
    public void TheTestWillBeSubmitted() {
        Assertions.assertTrue(startPage.readSubmitAssessment());
    }
}
