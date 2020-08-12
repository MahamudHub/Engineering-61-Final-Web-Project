package com.sparta.eng61.unittests;

import com.sparta.eng61.pageobjects.codingame.CodingamePage;
import com.sparta.eng61.pageobjects.dispatcher.*;
import com.sparta.eng61.pageobjects.gmail.GmailPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void roundTrip (){
        loginPage.login()
                .enterFields();
        dispatchesPage.openDispatchesPage();
        gmailPage.accessAssessmentLinkFromEmail().doTest();
        resultsPage.clickUpdate();
        resultsPage.openResultsPage();
    }
}
