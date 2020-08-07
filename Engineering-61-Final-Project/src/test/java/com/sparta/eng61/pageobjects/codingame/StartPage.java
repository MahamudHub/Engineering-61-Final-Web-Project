package com.sparta.eng61.pageobjects.codingame;

import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StartPage {

    WebDriver webDriver;
    By startButton = new By.ByCssSelector("*[data-test=\"AssessmentTile-TileButton\"]");
//  By startButton = new By.ByXPath("//div[@id='root']/div/div/div/div[2]/div/div/button");
//  By startButton = new By.ByCssSelector(".c0132");
//  By startButton = new By.ByName("Start");
//  By termsButton = new By.ByClassName("c0134");
    By termsButton = new By.ByCssSelector(".c0148 > label");
//  By confirmStart = new By.ByClassName("c0129 c0131");
    By confirmStart = new By.ByCssSelector("*[data-test=\"accept\"]");
//  By confirmStart = new By.ByClassName(".c0140");
    By firstQuestion = new By.ByCssSelector("*[data-test=\"TocQuestionButton\"]");
//    By firstClick = new By.ByCssSelector(".c01116:nth-child(2) label");
    By firstClick = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label[2]/span/label");
//    By firstNext = new By.ByCssSelector(".c01126");
    By firstNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
//    By secondQuestion = new By.ByCssSelector(".c0120:nth-child(2)");
    By secondQuestion = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div[8]/span/button");
//    By secondClick = new By.ByCssSelector(".c01116:nth-child(2)");
    By secondClick = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label[2]");
//    By secondNext = new By.ByCssSelector(".c01126");
    By secondNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
//    By thirdQuestion = new By.ByCssSelector(".c0120:nth-child(3)");
    By thirdQuestion = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[8]/span/button");
//    By thirdClick = new By.ByCssSelector(".c01118 > .c01108");
    By thirdClick = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label/span/label");
//    By thirdNext = new By.ByCssSelector(".c01126");
    By thirdNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
//    By fourthQuestion = new By.ByCssSelector(".c01118 label");
    By fourthQuestion = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[8]/span/button");
//    By fourthClick = new By.ByCssSelector(".c01116:nth-child(1) label");
    By fourthClick = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label");
//    By fourthNext = new By.ByCssSelector(".c01122");
    By fourthNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
    By submitTest = new By.ByCssSelector("*[data-test=\"SubmitTest\"]");
//    By confirmSubmit = new By.ByCssSelector(".c0170:nth-child(2)");
    By confirmSubmit = new By.ByXPath("//button[2]");

    public StartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public StartPage goToStartPage() {
        webDriver.manage().window().maximize();
        webDriver.get(" https://www.codingame.com/evaluate/?id=3947221b09528245452aeb36152ff118369dc82");
        return this;
    }

    public void clickStartButton() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(startButton).click();
    }

    public void clickTermsBox() {
        webDriver.findElement(termsButton).click();
    }

    public void confirmStartTest() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(confirmStart).click();
    }

    public void answerFirstQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(firstQuestion).click();
    }

    public void clickFirstQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(firstClick).click();
    }

    public void nextFirstQ() {
        webDriver.findElement(firstNext).click();
    }

    public void answerSecondQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(secondQuestion).click();
    }

    public void clickSecondQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(secondClick).click();
    }

    public void nextSecondQ() {
        webDriver.findElement(secondNext).click();
    }

    public void answerThirdQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(thirdQuestion).click();
    }

    public void clickThirdQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(thirdClick).click();
    }

    public void nextThirdQ() {
        webDriver.findElement(thirdNext).click();
    }

    public void answerFourthQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(fourthQuestion).click();
    }

    public void clickFourthQ() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(fourthClick).click();
    }

    public void nextFourthQ() {
        webDriver.findElement(fourthNext).click();
    }

    public void submitAnswers() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(submitTest).click();
    }

    public void confirmAnswers() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
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
