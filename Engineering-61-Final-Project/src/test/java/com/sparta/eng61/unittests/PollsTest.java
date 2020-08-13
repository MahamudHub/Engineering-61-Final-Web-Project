package com.sparta.eng61.unittests;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.PollsPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PollsTest {

    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    PollsPage pollsPage = new PollsPage(webDriver);

    public void openLoginPage() {
        loginPage.enterRightLoginCredentials();
        pollsPage.openPollsPage();
    }

    @Test
    public void titleTest() {
        openLoginPage();
        Assertions.assertEquals("Polls", pollsPage.getPollsPageTitleName());
        webDriver.close();
    }

    @Test
    public void pollTimeTest() {
        openLoginPage();
        Assertions.assertEquals("August 6th 2020, 12:00 pm", pollsPage.getPollTime());
        webDriver.close();
    }

    @Test
    public void pollTimeUpdateTest() {
        openLoginPage();
        Assertions.assertEquals(true, pollsPage.isPollTimeUpdatingAutomatically());
        webDriver.close();
    }

    @Test
    public void assessmentStatusTest() {
        openLoginPage();
        Assertions.assertEquals("waiting", pollsPage.getAssessmentStatus());
        webDriver.close();
    }

    @Test
    public void candidateEmailTest() {
        openLoginPage();
        Assertions.assertEquals("engcandidate61@gmail.com", pollsPage.getCandidateEmail());
        webDriver.close();
    }

    @Test
    public void testIdTest() {
        openLoginPage();
        Assertions.assertEquals("3944770", pollsPage.getTestId());
        webDriver.close();
    }
}