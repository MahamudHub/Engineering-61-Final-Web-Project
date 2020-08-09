package com.sparta.eng61;

import com.sparta.eng61.pageobjects.codingame.StartPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CodeingameTester {

    WebDriver webDriver = new ChromeDriver();
    StartPage startPage = new StartPage(webDriver);

    @Test
    public void doAssessment() {
        startPage.doTest();
    }

    @Test
    public void testStartPage() {
        startPage.goToStartPage().clickStartButton();
        Assertions.assertEquals(true,startPage.readStartPage());
    }

    @Test
    public void testQuestion() {
        startPage.doFirstQuestion();
        Assertions.assertEquals(true, startPage.readFirstQuestion());
    }

    @Test
    public void testSubmit() {
        startPage.submitAssessment();
        Assertions.assertEquals(true, startPage.readSubmitAssessment());
    }


  }

