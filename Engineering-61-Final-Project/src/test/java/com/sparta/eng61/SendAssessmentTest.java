package com.sparta.eng61;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendAssessmentTest {
    WebDriver webDriver = new ChromeDriver();
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);

    public void openLoginPage() {
        loginPage.enterRightLoginCredentials();
    }

    @Test
    public void titleTest() {
        openLoginPage();
        Assertions.assertEquals("Send Assessment", sendAssessmentPage.getPageTitleName());
        webDriver.close();
    }

    @Test
    public void candidateNamePlaceholderTest() {
        openLoginPage();
        Assertions.assertEquals(true,sendAssessmentPage.isCandidateNamePlaceholderCorrect());
        webDriver.close();
    }

    @Test
    public void candidateEmailPlaceholderTest() {
        openLoginPage();
        Assertions.assertEquals(true,sendAssessmentPage.isCandidateEmailPlaceholderCorrect());
        webDriver.close();
    }

    @Test
    public void recruiterEmailPlaceholderTest() {
        openLoginPage();
        Assertions.assertEquals(true,sendAssessmentPage.isRecruiterEmailPlaceholderCorrect());
        webDriver.close();
    }

    @Test
    public void numberOfAssessmentsTest() {
        openLoginPage();
        Assertions.assertEquals(5, sendAssessmentPage.getNumberOfAssessmentChoices());
        webDriver.close();
    }

    @Test
    public void assessmentChoiceTest() {
        openLoginPage();
        Assertions.assertEquals("Java Assessment", sendAssessmentPage.getAssessmentChoice("Java Assessment"));
        webDriver.close();
    }

    @Test
    public void psychometricAssessmentTest() {
        openLoginPage();
        System.out.println(sendAssessmentPage.getPsychometricAssessment());
        Assertions.assertEquals("Psychometric Assessment", sendAssessmentPage.getPsychometricAssessment());
        webDriver.close();
    }

    @Test
    public void sendPsychometricCheckboxTest() {
        openLoginPage();
        Assertions.assertEquals(true,sendAssessmentPage.isSendPsychometricVisible());
        webDriver.close();
    }

    @Test
    public void sentAssessmentHeaderTest() {
        openLoginPage();
        sendAssessmentPage.enterFields();
        Assertions.assertEquals("Assessment Sent", sendAssessmentPage.getPageHeader());
        webDriver.close();
    }

    @Test
    public void sentInfoContainsCandidateNameTest() {
        openLoginPage();
        sendAssessmentPage.enterFields();
        Assertions.assertEquals(true,sendAssessmentPage.isSentInfoIncludeName());
        webDriver.close();
    }

    @Test
    public void sentInfoContainsCandidateEmailTest() {
        openLoginPage();
        sendAssessmentPage.enterFields();
        Assertions.assertEquals(true,sendAssessmentPage.isSentInfoIncludeEmail());
        webDriver.close();
    }
}
