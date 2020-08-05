package com.sparta.eng61.pageobjects.codingame;

import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;

import java.util.List;

public class StartPage {

    WebDriver webDriver;
    By startButton = new By.ByCssSelector("*[data-test=AssessmentTile-TileButton]");
    By termsButton = new By.ByClassName("c0134");
    By confirmStart = new By.ByClassName("c0129 c0131");

    public StartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public StartPage goToStartPage() {
        webDriver.get(" https://www.codingame.com/evaluate?id=3943771a523a9f3f7ef66d8b60545428ef336de");
        webDriver.manage().window().maximize();
        return this;
    }

    public void clickStartButton() {
        webDriver.findElement(startButton).click();
    }

    public void clickTermsBox() {
        webDriver.findElement(termsButton).click();
    }

    public void confirmStartTest() {
        webDriver.findElement(confirmStart).click();
    }

//    public TestPage beginTest() {
//        goToStartPage();
//        clickStartButton();
//        clickTermsBox();
//        confirmStartTest();
//        return new TestPage(webDriver);
//    }
}
