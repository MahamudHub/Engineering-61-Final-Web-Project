package com.sparta.eng61;

import com.sparta.eng61.pageobjects.dispatcher.ResultsPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsTest {
    WebDriver webDriver = new ChromeDriver();
    ResultsPage resultsPage = new ResultsPage(webDriver);

    @Test
    public void titleTest() {
        Assertions.assertEquals("Results", resultsPage.getPageTitleName());
    }

    @Test
    public void candidateNameTest() {
        Assertions.assertEquals("Manish", resultsPage.getCandidateName());
    }

    @Test
    public void candidateEmailTest() {
        Assertions.assertEquals("engcandidate61@gmail.com", resultsPage.getCandidateEmail());
    }

    @Test
    public void candidateScoreTest() {
        Assertions.assertEquals("86", resultsPage.getCandidateScore());
    }

    @Test
    public void candidateNRScoreTest() {
        Assertions.assertEquals("100", resultsPage.getCandidateNR());
    }

    @Test
    public void candidateLRScoreTest() {
        Assertions.assertEquals("100", resultsPage.getCandidateLR());
    }

    @Test
    public void candidateVandCRScoreTest() {
        Assertions.assertEquals("100", resultsPage.getCandidateVandCR());
    }

    @Test
    public void updateTextTest() {
        Assertions.assertEquals("Update", resultsPage.getUpdateButtonTest());
    }
}
