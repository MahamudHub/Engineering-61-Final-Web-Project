package com.sparta.eng61;

import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendAssessmentTest {
    WebDriver webDriver = new ChromeDriver();
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);

    @Test
    public void titleTest() {
        Assertions.assertEquals("Send Assessment", sendAssessmentPage.getPageTitleName());
    }

    @Test
    public void candidateNamePlaceholderTest() {
        Assertions.assertTrue(sendAssessmentPage.isCandidateNamePlaceholderCorrect());
    }

    @Test
    public void candidateEmailPlaceholderTest() {
        Assertions.assertTrue(sendAssessmentPage.isCandidateEmailPlaceholderCorrect());
    }

    @Test
    public void recruiterEmailPlaceholderTest() {
        Assertions.assertTrue(sendAssessmentPage.isRecruiterEmailPlaceholderCorrect());
    }

    @Test
    public void numberOfAssessmentsTest() {
        Assertions.assertEquals(5, sendAssessmentPage.getNumberOfAssessmentChoices());
    }

    @Test
    public void assessmentChoiceTest() {
        Assertions.assertEquals("Java Assessment", sendAssessmentPage.getAssessmentChoice("Java Assessment"));
    }

    @Test
    public void psychometricAssessmentTest() {
        Assertions.assertEquals("Psychometric Assessment", sendAssessmentPage.getPsychometricAssessment());
    }

    @Test
    public void sendPsychometricCheckboxTest() {
        Assertions.assertTrue(sendAssessmentPage.isSendPsychometricVisible());
    }

    @Test
    public void sentAssessmentHeaderTest() {
        Assertions.assertEquals("Assessment Sent", sendAssessmentPage.getPageHeader());
    }

    @Test
    public void sentInfoContainsCandidateNameTest() {
        Assertions.assertTrue(sendAssessmentPage.isSentInfoIncludeName());
    }

    @Test
    public void sentInfoContainsCandidateEmailTest() {
        Assertions.assertTrue(sendAssessmentPage.isSentInfoIncludeEmail());
    }
}
