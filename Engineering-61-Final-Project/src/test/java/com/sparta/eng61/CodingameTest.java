package com.sparta.eng61;

import com.sparta.eng61.pageobjects.codingame.CodingamePage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingameTest {

    WebDriver webDriver = new ChromeDriver();
    CodingamePage codingamePage = new CodingamePage(webDriver);

    @Test
    public void doAssessment() {
        codingamePage.doTest();
    }

    @Test
    public void testFirstQuestion() {
        codingamePage.loadFirstQuestion();
        Assertions.assertEquals(true, codingamePage.isFirstQuestionLoading());
    }

    @Test
    public void testSecondQuestion() {
        codingamePage.loadSecondQuestion();
        Assertions.assertEquals(true, codingamePage.isSecondQuestionLoading());
    }

    @Test
    public void testThirdQuestion() {
        codingamePage.loadThirdQuestion();
        Assertions.assertEquals(true, codingamePage.isThirdQuestionLoading());
    }

    @Test
    public void testFourthQuestion() {
        codingamePage.loadFourthQuestion();
        Assertions.assertEquals(true, codingamePage.isFourthQuestionLoading());
    }

    @Test
    public void testSubmit() {
        codingamePage.submitAssessment();
        Assertions.assertEquals(true, codingamePage.isSubmitWorking());
    }


  }

