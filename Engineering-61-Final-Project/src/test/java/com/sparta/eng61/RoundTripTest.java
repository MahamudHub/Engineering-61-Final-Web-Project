package com.sparta.eng61;

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
    public void afterTest(){
       loginPage.enterRightLoginCredentials();
//        dispatchesPage.clickOnResultsPage();
        resultsPage.openResultsPage();
        resultsPage.clickUpdate();
        pollsPage.clickOnResultsPage();
    }
    @Test
    public void roundTrip (){
        loginPage.login()
                .enterFields();
        dispatchesPage.openDispatchesPage();
//        dispatchesPage.loggingOut();
        gmailPage.accessAssessmentLinkFromEmail().doTest();
//        resultsPage.clickUpdate();
//        resultsPage.openResultsPage();
        //codingamePage.goToDispatcher();
        //webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        afterTest();
    }
}
