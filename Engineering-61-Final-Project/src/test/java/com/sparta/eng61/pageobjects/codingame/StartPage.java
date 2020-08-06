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
//    By startButton = new By.ByCssSelector("*[data-test=\"AssessmentTile-TileButton\"]");
    By startButton = new By.ByCssSelector(".c0132");
    //  By termsButton = new By.ByClassName("c0134");
    By termsButton = new By.ByCssSelector(".c0148 > label");
//  By confirmStart = new By.ByClassName("c0129 c0131");
//  By confirmStart = new By.ByClassName("*[data-test=\"accept\"]");
    By confirmStart = new By.ByClassName(".c0140");
    By firstQuestion = new By.ByCssSelector("*[data-test=\"TocQuestionButton\"]");
    By firstClick = new By.ByCssSelector(".c01156:nth-child(3) label");
    By firstNext = new By.ByCssSelector(".c01168");
    By secondQuestion = new By.ByCssSelector(".c0160:nth-child(2)");
    By secondClick = new By.ByCssSelector(".c01156:nth-child(2) label");
    By secondNext = new By.ByCssSelector(".c01166");
    By thirdQuestion = new By.ByCssSelector(".c0160:nth-child(3)");
    By thirdClick = new By.ByCssSelector(".c01156:nth-child(1) label");
    By thirdNext = new By.ByCssSelector(".c01166");
    By fourthQuestion = new By.ByCssSelector(".c0160:nth-child(4)");
    By fourthClick = new By.ByCssSelector(".c01156:nth-child(1) label");
    By fourthNext = new By.ByCssSelector(".c01166");
    By submitTest = new By.ByCssSelector("*[data-test=\"SubmitTest\"]");
    By confirmSubmit = new By.ByCssSelector(".c01110:nth-child(2)");

    public StartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public StartPage goToStartPage() {
        webDriver.manage().window().maximize();
        webDriver.get(" https://www.codingame.com/evaluate/?id=39447702eefe67422fdae9ea19f1dd4801f00f1");
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

    public void answerFirstQ() {
        webDriver.findElement(firstQuestion).click();
    }

    public void clickFirstQ() {
        webDriver.findElement(firstClick).click();
    }

    public void nextFirstQ() {
        webDriver.findElement(firstNext).click();
    }

    public void answerSecondQ() {
        webDriver.findElement(secondQuestion).click();
    }

    public void clickSecondQ() {
        webDriver.findElement(secondClick).click();
    }

    public void nextSecondQ() {
        webDriver.findElement(secondNext).click();
    }

    public void answerThirdQ() {
        webDriver.findElement(thirdQuestion).click();
    }

    public void clickThirdQ() {
        webDriver.findElement(thirdClick).click();
    }

    public void nextThirdQ() {
        webDriver.findElement(thirdNext).click();
    }

    public void answerFourthQ() {
        webDriver.findElement(fourthQuestion).click();
    }

    public void clickFourthQ() {
        webDriver.findElement(fourthClick).click();
    }

    public void nextFourthQ() {
        webDriver.findElement(fourthNext).click();
    }

    public void submitAnswers() {
        webDriver.findElement(submitTest).click();
    }

    public void confirmAnswers() {
        webDriver.findElement(confirmSubmit).click();
    }

    public void doTest() {
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        answerFirstQ();
        clickFirstQ();
        nextFirstQ();
        answerSecondQ();
        clickSecondQ();
        nextSecondQ();
        answerThirdQ();
        clickThirdQ();
        nextThirdQ();
        answerFourthQ();
        clickFourthQ();
        nextFourthQ();
        submitAnswers();
        confirmAnswers();
    }


}
