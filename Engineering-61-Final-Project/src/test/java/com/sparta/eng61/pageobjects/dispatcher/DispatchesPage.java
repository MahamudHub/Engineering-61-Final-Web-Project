package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DispatchesPage {
    WebDriver webDriver;
    //-------Links identifiers in dispatches page----------
    By logOutLink = new By.ById("logout_link");
    By dispatchesLink = new By.ByLinkText("Dispatches");
    By resultsLink = new By.ByLinkText("Results");
    By pollsLink = new By.ByLinkText("Polls");
    By sendAssessmentLink = new By.ByClassName("logoHeader");

    //---------Fields identifiers in dispatches page -----------------------
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
    //==========TESTING METHODS==============
    public void logoutFromDispatches(){
        openDispatchesPage();
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
    //-------Field headers------
    public boolean isCandidateNameCorrect(){
        return webDriver.getPageSource().contains("Name");
    }
    public boolean isCandidateEmailCorrect(){
        return webDriver.getPageSource().contains("Email");
    }
    public boolean isRecruiterEmailCorrect(){
        return webDriver.getPageSource().contains("Recruiter");
    }
    public boolean isAssessmentCorrect(){
        return webDriver.getPageSource().contains("Assessment");
    }
    public boolean isTestIdCorrect(){
        return webDriver.getPageSource().contains("Test Id");
    }
    public boolean isTimeSentCorrect(){
       return webDriver.getPageSource().contains("Time Sent");
    }
    public boolean isCompleteCorrect(){
        return webDriver.getPageSource().contains("Complete");
    }
    public boolean isExpiredCorrect(){
        return webDriver.getPageSource().contains("Expired");
    }

    public boolean fieldHeaders(){
        boolean allFields = false;
        if(isCandidateNameCorrect()&&
        isCandidateEmailCorrect()&&
        isRecruiterEmailCorrect()&&
        isAssessmentCorrect()&&
        isTestIdCorrect()&&
        isTestIdCorrect()&&
        isTimeSentCorrect()&&
        isCompleteCorrect()&&
        isExpiredCorrect()){
            return true;
        }
            return allFields;
    }
    
    //-------Fields-------
    public String getCandidateName(){
        return webDriver.findElement(candidateName).getText();
    }
    public String getCandidateEmail(){
        return webDriver.findElement(candidateEmail).getText();
    }
    public String getRecruiterEmail(){
        return webDriver.findElement(recruiterEmail).getText();
    }
    public String getAssessmentType(){
        return webDriver.findElement(assessmentType).getText();
    }
    public String getTestId(){
        return webDriver.findElement(testId).getText();
    }
    public String getTimeSent(){
        return webDriver.findElement(timeSent).getText();
    }
    public String getComplete(){
        return webDriver.findElement(complete).getText();
    }
    public String getExpired(){
       return webDriver.findElement(expired).getText();
    }
}
