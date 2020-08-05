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
    By candidateNR = new By.ByCssSelector("css=tbody .col-1:nth-child(6)");
    By candidateLR = new By.ByCssSelector("css=tbody .col-1:nth-child(7)");
    By candidateVandCR = new By.ByCssSelector("css=tbody .col-2:nth-child(8)");

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
