package com.sparta.eng61;

import com.sparta.eng61.pageobjects.dispatcher.PollsPage;
import com.sparta.eng61.pageobjects.dispatcher.ResultsPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PollsTest {

    WebDriver webDriver = new ChromeDriver();
    PollsPage pollsPage = new PollsPage(webDriver);

    @Test
    public void titleTest() {
        Assertions.assertEquals("Polls", pollsPage.getPageTitleName());
    }

    @Test
    public void pollTimeTest() {
        Assertions.assertEquals("August 5th 2020, 4:00 pm", pollsPage.getPollTime());
    }

    @Test
    public void assessmentStatusTest() {
        Assertions.assertEquals("waiting", pollsPage.getAssessmentStatus());
    }

    @Test
    public void candidateEmailTest() {
        Assertions.assertEquals("engcandidate61@gmail.com", pollsPage.getCandidateEmail());
    }

    @Test
    public void testIdTest() {
        Assertions.assertEquals("3943771", pollsPage.getTestId());
    }
}