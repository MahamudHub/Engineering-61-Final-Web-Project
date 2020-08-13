package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollsPage {
    WebDriver webDriver;
    By pageTitle = new By.ById("login_title");
    By pollTime = new By.ByCssSelector("tbody > .d-flex:nth-child(1) > .col-3:nth-child(1)");
    By assessmentStatus = new By.ByCssSelector("tbody > .d-flex:nth-child(1) > .col-3:nth-child(2)");
    By candidateEmail = new By.ByCssSelector("tbody > .d-flex:nth-child(1) > .col-3:nth-child(3)");
    By testId = new By.ByCssSelector("tbody > .d-flex:nth-child(1) > .col-3:nth-child(4)");
    By logOutLink = new By.ById("logout_link");
    By dispatchesLink = new By.ByLinkText("Dispatches");
    By resultsLink = new By.ByLinkText("Results");
    By pollsLink = new By.ByLinkText("Polls");
    By sendAssessmentLink = new By.ByClassName("logoHeader");

    public PollsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();

    }

    public PollsPage openPollsPage() {
        webDriver.get("https://eng61.spartaglobal.academy/polls");
        return this;
    }

    public void loggingOut(){
        webDriver.findElement(logOutLink).click();
    }

    public void logoutFromPolls(){
        openPollsPage();
        loggingOut();
    }

    public String getUrl(){
        return webDriver.getCurrentUrl();
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

    public String getPollsPageTitleName() {
        return webDriver.findElement(pageTitle).getText();
    }

    public String getPollTime() {
        return webDriver.findElement(pollTime).getText();
    }

    public String getAssessmentStatus() {
        return webDriver.findElement(assessmentStatus).getText();
    }

    public String getCandidateEmail() {
        return webDriver.findElement(candidateEmail).getText();
    }

    public String getTestId() {
        return webDriver.findElement(testId).getText();
    }

    public boolean isPollTimeUpdatingAutomatically() {
        if (getPollTime().contains("8:00 am")
                || getPollTime().contains("12:00 pm")
                || getPollTime().contains("4:00 pm")){
            return true;
        }
        return false;
    }
}