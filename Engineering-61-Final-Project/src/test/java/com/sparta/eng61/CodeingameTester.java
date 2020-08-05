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
    public void testing(){
        startPage.goToStartPage();
        startPage.clickStartButton();
    }

    @Test
    public void ksjd(){
            webDriver.get(" https://www.codingame.com/evaluate?id=3943771a523a9f3f7ef66d8b60545428ef336de");
            webDriver.manage().window().maximize();
            webDriver.findElement(By.cssSelector("*[data-test=\"AssessmentTile-TileButton\"]")).click();
    }
    }

