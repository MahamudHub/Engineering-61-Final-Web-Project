package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {

    WebDriver webDriver;
    By pageTitle = new By.ById("login_title");
    By updateButton = new By.ByClassName("btn btn-secondary submit");
    By candidateName = new By.ByClassName("col-2");
    By candidateEmail = new By.ByClassName("col-3");
    By candidateScore = new By.ByClassName("col-1 font-weight-bold dark");

    public ResultsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        webDriver.get("https://eng61.spartaglobal.academy/results");
    }

    public String getPageTitleName() {
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

    public String getUpdateButtonTest() {
        return webDriver.findElement(updateButton).getText();
    }

    public void clickUpdate() {
        webDriver.findElement(updateButton).click();
    }

}
