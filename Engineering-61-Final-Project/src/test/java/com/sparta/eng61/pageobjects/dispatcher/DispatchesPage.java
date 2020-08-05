package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DispatchesPage {
    WebDriver webDriver;
    By logOutLink = new By.ById("logout_link");
    By candidateName = new By.ByCssSelector("tbody > tr:nth-child(1) > th");
    By candidateEmail = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(2)");
    By recruiterEmail = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(3)");
    By assessmentType = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(4)");
    By testId = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(5)");
    By timeSent = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(6)");
    By complete = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(7)");
    By expired = new By.ByCssSelector("tr:nth-child(1) > td:nth-child(8)");

    public DispatchesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public DispatchesPage openDispatchesPage () {
        webDriver.manage().window();
        webDriver.get("https://eng61.spartaglobal.academy/dispatches");
        return this;
    }
    public void loggingOut(){
        webDriver.findElement(logOutLink).click();
    }
    public void LogoutfromPolls(){
        openDispatchesPage();
        loggingOut();
    }
    public String getCandName(){
        String candName = webDriver.findElement(candidateName).getText();
        return candName;
    }
    public String getCandidateEmail(){
        String candEmail = webDriver.findElement(candidateEmail).getText();
        return candEmail;
    }
    public String getRecruiterEmail(){
        String recruiteremail = webDriver.findElement(recruiterEmail).getText();
        return recruiteremail;
    }
    public String getAssessmentType(){
        String assessment = webDriver.findElement(assessmentType).getText();
        return assessment;
    }
    public String getTestId(){
        String testid = webDriver.findElement(testId).getText();
        return testid;
    }
    public String getTimeSent(){
        String timesent = webDriver.findElement(timeSent).getText();
        return timesent;
    }
    public String getComplete(){
        String Complete = webDriver.findElement(complete).getText();
        return Complete;
    }
    public String getExpired(){
        String Expired = webDriver.findElement(expired).getText();
        return Expired;
    }

}
