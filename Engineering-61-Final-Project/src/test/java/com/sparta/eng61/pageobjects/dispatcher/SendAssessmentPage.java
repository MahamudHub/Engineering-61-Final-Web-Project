package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SendAssessmentPage {
    private Properties properties = new Properties();

    WebDriver webDriver;
    By assessment = new By.ById("assessment");
    By sendPsychometricCheckbox = new By.ById("checkbox");
    By candidateName = new By.ById("candidate_name");
    By candidateEmail = new By.ById("candidate_email");
    By recruiterEmail = new By.ById("recruiter_email");
    By submit = new By.ById("submit");
    By pageTitle = new By.ById("page_title");
    By pageHeader = new By.ById("page_header");
    By sentInfo = new By.ByClassName("lead");


    public SendAssessmentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        webDriver.get("https://eng61.spartaglobal.academy/");
    }

    private void propertiesAccess() {
        try {
            properties.load(new FileReader("src/test/resources/SendAssessment.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        return getSentInfo().contains(properties.getProperty("candidateName"));
    }

    public boolean isSentInfoIncludeEmail() {
        return getSentInfo().contains(properties.getProperty("candidateEmail"));
    }

    //--------------------Placeholder--------------------//

    public boolean isCandidateNamePlaceholderCorrect() {
        String firstName = webDriver.findElement(candidateName).getAttribute("placeholder");
        String text = "Enter candidate name";
        return firstName.contains(text);
    }

    public boolean isCandidateEmailPlaceholderCorrect() {
        String firstName = webDriver.findElement(candidateEmail).getAttribute("placeholder");
        String text = "Enter candidate e-mail";
        return firstName.contains(text);
    }

    public boolean isRecruiterEmailPlaceholderCorrect() {
        String firstName = webDriver.findElement(recruiterEmail).getAttribute("placeholder");
        String text = "Enter recruiter e-mail";
        return firstName.contains(text);
    }

    //--------------------Assessment choices--------------------//

    public int getNumberOfAssessmentChoices() {
        WebElement select = webDriver.findElement(assessment);
        List<WebElement> options = select.findElements(By.tagName("option"));
        return options.size();
    }

    public String getAssessmentChoice(String option) {
        Select dropdown = new Select(webDriver.findElement(assessment));
        dropdown.selectByVisibleText(option);
        return dropdown.toString();
    }

    public String getPsychometricAssessment() {
        Select dropdown = new Select(webDriver.findElement(assessment));
        dropdown.selectByVisibleText("Psychometric Assessment");
        return dropdown.toString();
    }

    public boolean isSendPsychometricVisible() {
        return webDriver.findElement(sendPsychometricCheckbox).isDisplayed();
    }

    //--------------------Entering the fields & click --------------------//
    public void selectAssessment() {
        Select dropdown = new Select(webDriver.findElement(assessment));
        dropdown.selectByValue("psychometric");
    }

    public void enterCandidateName() {
        webDriver.findElement(candidateName).sendKeys(properties.getProperty("candidateName"));
    }

    public void enterCandidateEmail() {
        webDriver.findElement(candidateEmail).sendKeys(properties.getProperty("candidateEmail"));
    }

    public void enterRecruiterEmail() {
        webDriver.findElement(recruiterEmail).sendKeys(properties.getProperty("recruiterEmail"));
    }

    public void clickSubmit() {
        webDriver.findElement(submit).click();
    }

    public void enterFields() {
        selectAssessment();
        enterCandidateName();
        enterCandidateEmail();
        enterRecruiterEmail();
        clickSubmit();
    }
}
