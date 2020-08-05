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
    public void LogoutfromDispatches(){
        openDispatchesPage();
        loggingOut();
    }
    public void clickDispatches(){
        webDriver.findElement(dispatchesLink).click();
    }
    public void clickResults(){
        webDriver.findElement(resultsLink).click();
    }
    public void clickPolls(){
        webDriver.findElement(pollsLink).click();
    }

    //-------Field headers------
    public boolean nameheader(){
        boolean name = webDriver.getPageSource().contains("Name");
        return name;
    }
    public boolean candidateEmailheader(){
        boolean CandidateEmail = webDriver.getPageSource().contains("Email");
        return CandidateEmail;
    }
    public boolean recruiterheader(){
        boolean RecruiterEmail = webDriver.getPageSource().contains("Recruiter");
        return RecruiterEmail;
    }
    public boolean AssessmentTypeheader(){
        boolean AssessmentType = webDriver.getPageSource().contains("Assessment");
        return AssessmentType;
    }
    public boolean testIdheader(){
        boolean Testid = webDriver.getPageSource().contains("Test Id");
        return Testid;
    }
    public boolean timeSentheader(){
        boolean Timesent = webDriver.getPageSource().contains("Time Sent");
        return Timesent;
    }
    public boolean completeheader(){
        boolean Complete = webDriver.getPageSource().contains("Complete");
        return Complete;
    }
    public boolean expiredheader(){
        boolean Expired = webDriver.getPageSource().contains("Expired");
        return Expired;
    }

    public boolean fieldHeaders(){
        boolean allFileds = false;
        if(nameheader()&&
        candidateEmailheader()&&
        recruiterheader()&&
        AssessmentTypeheader()&&
        testIdheader()&&
        testIdheader()&&
        timeSentheader()&&
        completeheader()&&
        expiredheader()){
            return true;
        }
            return allFileds;
    }



    //-------Fields-------
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
