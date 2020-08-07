package com.sparta.eng61.pageobjects.gmail;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
    WebDriver webDriver = new ChromeDriver();
    GmailPage gmailLogin = new GmailPage(webDriver);

    @Test
    public void LoggingIn() {
        gmailLogin.accessAssessmentLinkFromEmail();
    }

    @Test
    public void testingSpartaGloablEmailAccess(){
        gmailLogin.accessCandidateEmail();
        Assertions.assertEquals(true, gmailLogin.openAssessmentLinkEmail());
    }

    @Test
    public void testingBooleanMethod(){
        gmailLogin.assessmentLinkInEmail();
        Assertions.assertEquals(true, gmailLogin.isLinkInEmail());
    }
}
