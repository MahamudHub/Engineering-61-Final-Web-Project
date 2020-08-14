package com.sparta.eng61.unittests;

import com.sparta.eng61.helpers.WebDriverFactory;
import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.PollsPage;
import com.sparta.eng61.pageobjects.dispatcher.ResultsPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ResultsTest {
    WebDriver webDriver = WebDriverFactory.SelectDriver("Firefox");
    LoginPage loginPage = new LoginPage(webDriver);
    ResultsPage resultsPage = new ResultsPage(webDriver);
    PollsPage pollsPage = new PollsPage(webDriver);

    public void openLoginPage() {
        loginPage.enterRightLoginCredentials();
        resultsPage.openResultsPage();
    }

    @Test
    public void titleTest() {
        openLoginPage();
        Assertions.assertEquals("Results", resultsPage.getResultsPageTitleName());
        webDriver.close();
    }

    @Test
    public void candidateNameTest() {
        openLoginPage();
        Assertions.assertEquals("Manish", resultsPage.getCandidateName());
        webDriver.close();
    }

    @Test
    public void candidateEmailTest() {
        openLoginPage();
        Assertions.assertEquals("engcandidate61@gmail.com", resultsPage.getCandidateEmail());
        webDriver.close();
    }

    @Test
    public void candidateScoreTest() {
        openLoginPage();
        Assertions.assertEquals("86", resultsPage.getCandidateScore());
        webDriver.close();
    }

    @Test
    public void candidateNRScoreTest() {
        openLoginPage();
        Assertions.assertEquals("100", resultsPage.getCandidateNR());
        webDriver.close();
    }

    @Test
    public void candidateLRScoreTest() {
        openLoginPage();
        Assertions.assertEquals("100", resultsPage.getCandidateLR());
        webDriver.close();
    }

    @Test
    public void candidateVandCRScoreTest() {
        openLoginPage();
        Assertions.assertEquals("100", resultsPage.getCandidateVandCR());
        webDriver.close();
    }

    @Test
    public void updateTextTest() {
        openLoginPage();
        Assertions.assertEquals("UPDATE", resultsPage.getUpdateButtonTest());
        webDriver.close();
    }

    @Test
    public void clickUpdateTest() {
        openLoginPage();
        resultsPage.clickUpdate();
        //Assertions.assertEquals(pollsPage.openPollsPage(), resultsPage.clickUpdate());
        //webDriver.close();
    }
}
