package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {

    WebDriver webDriver;
    By pageTitle = new By.ById("login_title");
    By logOutLink = new By.ById("logout_link");
    By updateButton = new By.ByClassName("btn btn-secondary submit");
    By candidateName = new By.ByCssSelector(".table:nth-child(4) > tbody .col-2:nth-child(1)");
    By candidateEmail = new By.ByCssSelector(".table:nth-child(4) > tbody .col-3");
    By candidateScore = new By.ByCssSelector(".dark");
    By candidateNR = new By.ByCssSelector("tbody .col-1:nth-child(5)");
    By candidateLR = new By.ByCssSelector("tbody .col-1:nth-child(7)");
    By candidateVandCR = new By.ByCssSelector("tbody .col-2:nth-child(8)");
    By dispatchesLink = new By.ByLinkText("Dispatches");
    By resultsLink = new By.ByLinkText("Results");
    By pollsLink = new By.ByLinkText("Polls");
    By sendAssessmentLink = new By.ByClassName("logoHeader");

    public ResultsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();

    }

    public ResultsPage openResultsPage(){
        webDriver.get("https://eng61.spartaglobal.academy/results");
        return this;
    }


    public String getUrl(){
        return webDriver.getCurrentUrl();
    }

    public void loggingOut(){
        webDriver.findElement(logOutLink).click();
    }

    public void logoutFromResults(){
        openResultsPage();
        loggingOut();
    }

    public void clickOnDispatchesPage(){
        webDriver.findElement(dispatchesLink).click();
    }
    public void clickOnResultsPage(){
        webDriver.findElement(resultsLink).click();
    }
    public void clickOnPollsPage(){
        webDriver.findElement(pollsLink).click();
    }
    public void clickOnLogo(){
        webDriver.findElement(sendAssessmentLink).click();
    }

    public String getResultsPageTitleName() {
        return webDriver.findElement(pageTitle).getText();
    }

    public String getCandidateName() {
        return webDriver.findElement(candidateName).getText();
    }

    public String getCandidateEmail() {
        return webDriver.findElement(candidateEmail).getText();
    }

    public String getCandidateScore() {
        return webDriver.findElement(candidateScore).getText();
    }

    public String getCandidateNR() {
        return webDriver.findElement(candidateNR).getText();
    }

    public String getCandidateLR() {
        return webDriver.findElement(candidateLR).getText();
    }

    public String getCandidateVandCR() {
        return webDriver.findElement(candidateVandCR).getText();
    }

    public String getUpdateButtonTest() {
        return webDriver.findElement(updateButton).getText();
    }

    public void clickUpdate() {
        webDriver.findElement(updateButton).click();
    }

}
