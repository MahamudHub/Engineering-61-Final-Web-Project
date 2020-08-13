package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.gmail.GmailPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sparta.eng61.pageobjects.codingame.CodingamePage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;

public class GmailStepdef {

    WebDriver webdriver = new ChromeDriver();
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webdriver);
    GmailPage gmailPage = new GmailPage(webdriver);
    CodingamePage codingamePage = new CodingamePage(webdriver);


    @Given("I have sent the candidate an assessment link email")
    public void iHaveSentTheCandidateAnAssessmentLinkEmail() {
        sendAssessmentPage.enterFields();
    }

    @When("they access their email")
    public void theyAccessTheirEmail() {
        gmailPage.accessCandidateEmail();
    }

    @Then("they will find an email from Sparta Global")
    public void theyWillFindAnEmailFromSpartaGlobal() {
        Assertions.assertEquals(true, gmailPage.openAssessmentLinkEmail());
    }

    @When("they click the link within the email")
    public void theyClickTheLinkWithinTheEmail() {
        gmailPage.accessAssessmentLinkFromEmail();
    }

    @Then("they will be taken to the Codeingames test")
    public void theyWillBeTakenToTheCodeingamesTest() {
        Assertions.assertEquals(true, codingamePage.isStartPageLoading());
    }
}
