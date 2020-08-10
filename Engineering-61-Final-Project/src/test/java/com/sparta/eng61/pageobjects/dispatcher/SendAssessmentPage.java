package com.sparta.eng61.pageobjects.dispatcher;

import com.sparta.eng61.propertiesloader.PropertiesFileLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SendAssessmentPage {
    PropertiesFileLoader properties = new PropertiesFileLoader();

    WebDriver webDriver;
    By assessmentChoices = new By.ById("assessment");
    By sendPsychometricCheckbox = new By.ById("checkbox");
    By candidateNameField = new By.ById("candidate_name");
    By candidateEmailField = new By.ById("candidate_email");
    By recruiterEmailField = new By.ById("recruiter_email");
    By logOutLink = new By.ById("logout_link");
    By dispatchesLink = new By.ByLinkText("Dispatches");
    By resultsLink = new By.ByLinkText("Results");
    By pollsLink = new By.ByLinkText("Polls");
    By sendAssessmentLink = new By.ByClassName("logoHeader");
    By submitButton = new By.ById("submit");
    By pageTitle = new By.ById("page_title");
    By pageHeader = new By.ById("page_header");
    By sentInfo = new By.ByClassName("lead");


    public SendAssessmentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();

    }

    public SendAssessmentPage openSendAssessmentPage(){
        webDriver.get("https://eng61.spartaglobal.academy/");
        return this;
    }

    public String getUrl(){
        return webDriver.getCurrentUrl();
    }

    public void loggingOut(){
        webDriver.findElement(logOutLink).click();
    }

    public void logoutFromSendAssessment(){
        openSendAssessmentPage();
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

    public String getPageTitleName() {
        return webDriver.findElement(pageTitle).getText();
    }

    //After submit "Assessment Sent"
    public String getPageHeader() {
        return webDriver.findElement(pageHeader).getText();
    }

    public String getSentInfo() {
        return webDriver.findElement(sentInfo).getText();
    }

    public boolean isSentInfoIncludeName() {
        return getSentInfo().contains(properties.getCandidateName());
    }

    public boolean isSentInfoIncludeEmail() {
        return getSentInfo().contains(properties.getCandidateEmail());
    }

    //--------------------Placeholder--------------------//

    public boolean isCandidateNamePlaceholderCorrect() {
        String firstName = webDriver.findElement(candidateNameField).getAttribute("placeholder");
        String text = "Enter candidate name";
        return firstName.contains(text);
    }

    public boolean isCandidateEmailPlaceholderCorrect() {
        String firstName = webDriver.findElement(candidateEmailField).getAttribute("placeholder");
        String text = "Enter candidate e-mail";
        return firstName.contains(text);
    }

    public boolean isRecruiterEmailPlaceholderCorrect() {
        String firstName = webDriver.findElement(recruiterEmailField).getAttribute("placeholder");
        String text = "Enter recruiter e-mail";
        return firstName.contains(text);
    }

    //--------------------Assessment choices--------------------//

    public int getNumberOfAssessmentChoices() {
        WebElement select = webDriver.findElement(assessmentChoices);
        List<WebElement> options = select.findElements(By.tagName("option"));
        return options.size();
    }

    public String getAssessmentChoice(String option) {
        Select dropdown = new Select(webDriver.findElement(assessmentChoices));
        dropdown.selectByVisibleText(option);
        return dropdown.toString();
    }

    public String getPsychometricAssessment() {
        Select dropdown = new Select(webDriver.findElement(assessmentChoices));
        dropdown.selectByVisibleText("Psychometric Assessment");
        return dropdown.toString();
    }

    public boolean isSendPsychometricVisible() {
        return webDriver.findElement(sendPsychometricCheckbox).isDisplayed();
    }

    //--------------------Entering the fields & click --------------------//
    public void selectAssessment() {
        Select dropdown = new Select(webDriver.findElement(assessmentChoices));
        dropdown.selectByValue("psychometric");
    }

    public void enterCandidateName() {
        webDriver.findElement(candidateNameField).sendKeys(properties.getCandidateName());
    }

    public void enterCandidateEmail() {
        webDriver.findElement(candidateEmailField).sendKeys(properties.getCandidateEmail());
    }

    public void enterRecruiterEmail() {
        webDriver.findElement(recruiterEmailField).sendKeys(properties.getRecruiterEmail());
    }

    public void clickSubmit() {
        webDriver.findElement(submitButton).click();
    }

    public void enterFields() {
        selectAssessment();
        enterCandidateName();
        enterCandidateEmail();
        enterRecruiterEmail();
        clickSubmit();
    }
}
