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

    public PollsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();

    }

    public PollsPage openPollsPage() {
        webDriver.get("https://eng61.spartaglobal.academy/polls");
        return this;
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
}