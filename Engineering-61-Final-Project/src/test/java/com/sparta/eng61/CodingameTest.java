package com.sparta.eng61;

import com.sparta.eng61.pageobjects.codingame.CodingamePage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingameTest {

    WebDriver webDriver = new ChromeDriver();
    CodingamePage startPage = new CodingamePage(webDriver);

    @Test
    public void doAssessment() {
        startPage.doTest();
    }

    @Test
    public void testFirstQuestion() {
        startPage.loadFirstQuestion();
        Assertions.assertEquals(true, startPage.isFirstQuestionLoading());
    }

    @Test
    public void testSecondQuestion() {
        startPage.loadSecondQuestion();
        Assertions.assertTrue(startPage.isSecondQuestionLoading());
    }

    @Test
    public void testThirdQuestion() {
        startPage.loadThirdQuestion();
        Assertions.assertTrue(startPage.isThirdQuestionLoading());
    }

    @Test
    public void testFourthQuestion() {
        startPage.loadFourthQuestion();
        Assertions.assertTrue(startPage.isFourthQuestionLoading());
    }

    @Test
    public void testSubmit() {
        startPage.submitAssessment();
        Assertions.assertTrue(startPage.isSubmitWorking());
    }


  }

