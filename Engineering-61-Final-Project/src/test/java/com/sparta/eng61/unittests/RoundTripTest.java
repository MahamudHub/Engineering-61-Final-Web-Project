package com.sparta.eng61.unittests;

import com.sparta.eng61.pageobjects.codingame.CodingamePage;
import com.sparta.eng61.pageobjects.dispatcher.*;
import com.sparta.eng61.pageobjects.gmail.GmailPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RoundTripTest {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    ResultsPage resultsPage = new ResultsPage(webDriver);
    PollsPage pollsPage = new PollsPage(webDriver);
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    LogoutPage logoutPage = new LogoutPage(webDriver);
    GmailPage gmailPage = new GmailPage(webDriver);
    CodingamePage codingamePage = new CodingamePage(webDriver);


    @Test
    public void executeRoundTrip(){
        sendAssesment();
        clickOnGmailLink();
        completeCodinGameAssesment();
        checkForResults();
    }

    private void sendAssesment() {
        loginPage.login()
                .enterFields();
        dispatchesPage.openDispatchesPage();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    private void clickOnGmailLink() {
        gmailPage.accessAssessmentLinkFromEmail();
    }
    private void completeCodinGameAssesment() {
        codingamePage.doTest();
    }

    private void checkForResults() {
        loginPage.relogin();
        resultsPage.openResultsPage();
        resultsPage.clickUpdate();
        pollsPage.clickOnResultsPage();
    }


}
