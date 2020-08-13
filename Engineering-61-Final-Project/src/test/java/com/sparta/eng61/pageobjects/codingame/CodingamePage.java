package com.sparta.eng61.pageobjects.codingame;

import com.sparta.eng61.pageobjects.gmail.GmailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CodingamePage {

    WebDriver webDriver;
    GmailPage gmailPage = new GmailPage(webDriver);

    By startButton = new By.ByCssSelector("*[data-test=\"AssessmentTile-TileButton\"]");
    By termsButton = new By.ByCssSelector(".c0148 > label");
    By confirmStart = new By.ByCssSelector("*[data-test=\"accept\"]");

    By firstQuestion = new By.ByCssSelector("*[data-test=\"TocQuestionButton\"]");
    By firstAnswer = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label[2]/span/label");
    By firstNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
    By secondQuestion = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div[8]/span/button");
    By secondAnswer = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label[2]");
    By secondNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
    By thirdQuestion = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div[8]/span/button");
    By thirdAnswer = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label/span/label");
    By thirdNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");
    By fourthQuestion = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div/div[4]/div[8]/span/button");
    By fourthAnswer = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/label");
    By fourthNext = new By.ByXPath("//div[@id='root']/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/button/span");

    By submitTest = new By.ByCssSelector("*[data-test=\"SubmitTest\"]");
    By confirmSubmit = new By.ByXPath("//button[2]");

   // By starRating = new By.ByCssSelector("span:nth-child(5) > span > img");
    By starRating = new By.ByXPath("//*[@id=\"root\"]/div/div/div[2]/div/div/form/div/div/div[1]/div[2]/span/span[5]/img");
    By giveFeedback = new By.ByName("comment");
    By submitFeedback = new By.ByXPath("//button[@type='submit']");

    public CodingamePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public CodingamePage goToStartPage() {
        gmailPage.accessAssessmentLinkFromEmail();
        return this;
    }

    public void clickStartButton() {
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.findElement(startButton).click();
    }

    public String getCodingameURL(){
        return webDriver.getCurrentUrl();
    }

    public void clickTermsBox() {
        webDriver.findElement(termsButton).click();
    }

    public void confirmStartTest() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(confirmStart).click();
    }

    public void clickFirstQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(firstQuestion).click();
    }

    public void answerFirstQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(firstAnswer).click();
    }

    public void nextFirstQuestion() {
        webDriver.findElement(firstNext).click();
    }

    public void clickSecondQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(secondQuestion).click();
    }

    public void answerSecondQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(secondAnswer).click();
    }

    public void nextSecondQuestion() {
        webDriver.findElement(secondNext).click();
    }

    public void clickThirdQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(thirdQuestion).click();
    }

    public void answerThirdQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(thirdAnswer).click();
    }

    public void nextThirdQuestion() {
        webDriver.findElement(thirdNext).click();
    }

    public void clickFourthQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(fourthQuestion).click();
    }

    public void answerFourthQuestion() {
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        webDriver.findElement(fourthAnswer).click();
    }

    public void nextFourthQuestion() {
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
    public void doFeedback() {
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.findElement(starRating).click();
        webDriver.findElement(giveFeedback).sendKeys("Looking forward to the results :)");
        webDriver.findElement(submitFeedback).click();
    }

    public void doTest() {
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        clickFirstQuestion();
        answerFirstQuestion();
        nextFirstQuestion();
        clickSecondQuestion();
        answerSecondQuestion();
        nextSecondQuestion();
        clickThirdQuestion();
        answerThirdQuestion();
        nextThirdQuestion();
        clickFourthQuestion();
        answerFourthQuestion();
        nextFourthQuestion();
        submitAnswers();
        confirmAnswers();
        doFeedback();
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    public void navigateToDispatcher(){
        webDriver.navigate().to("https://eng61.spartaglobal.academy/results");
    }

    public void goToDispatcher() {
        String url = "https://eng61.spartaglobal.academy/login";
        webDriver.get(url);
    }

    public boolean isStartPageLoading() {
        goToStartPage();
        return webDriver.findElement(startButton).toString().contains("Start");
    }

    public void loadFirstQuestion() {
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        clickFirstQuestion();
    }

    public boolean isFirstQuestionLoading() {
        return webDriver.findElement(firstQuestion).toString().contains("1");
    }

    public void loadSecondQuestion() {
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        clickSecondQuestion();
    }

    public boolean isSecondQuestionLoading() {
        return webDriver.findElement(secondQuestion).toString().contains("2");
    }

    public void loadThirdQuestion() {
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        clickThirdQuestion();
    }

    public boolean isThirdQuestionLoading() {
        return webDriver.findElement(thirdQuestion).toString().contains("3");
    }

    public void loadFourthQuestion() {
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        clickFourthQuestion();
    }

    public boolean isFourthQuestionLoading() {
        return webDriver.findElement(fourthQuestion).toString().contains("4");
    }

    public void submitAssessment() {
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        clickFirstQuestion();
        answerFirstQuestion();
        nextFirstQuestion();
        clickSecondQuestion();
        answerSecondQuestion();
        nextSecondQuestion();
        clickThirdQuestion();
        answerThirdQuestion();
        nextThirdQuestion();
        clickFourthQuestion();
        answerFourthQuestion();
        nextFourthQuestion();
        submitAnswers();
    }

    public boolean isSubmitWorking() {
        return webDriver.findElement(submitTest).toString().contains("End Test");
    }


}
