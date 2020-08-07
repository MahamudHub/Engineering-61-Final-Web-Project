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


//    @Test
//    public void titleTest() {
//        doAssessment();
//        Assertions.assertEquals();
//    }
  }

