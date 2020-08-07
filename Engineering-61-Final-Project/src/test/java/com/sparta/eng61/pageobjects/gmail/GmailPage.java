package com.sparta.eng61.pageobjects.gmail;

import com.sparta.eng61.propertiesloader.PropertiesFileLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GmailPage {

    WebDriver webDriver;
    By emailAddress = new By.ById("identifierId");
    By emailNext = new By.ByCssSelector("#identifierNext > div > button");
    By password = new By.ByName("password");
    By passwordNext = new By.ByCssSelector("#passwordNext > div > button");
    By selectEmail = new By.ByXPath("(//span[@name='Sparta Global'])[2]");
    By assessmentLink = new By.ByPartialLinkText("https://www.codingame.com/");
    PropertiesFileLoader properties = new PropertiesFileLoader();

    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public GmailPage goToGmailLoginPage() {
        webDriver.manage().window().maximize();
        webDriver.get("http://mail.google.com/mail?hl=en-GB");
        return this;
    }

    private void enterCandidateEmail() {
        webDriver.findElement(emailAddress).sendKeys(properties.getCandidateEmail());
    }

    private void clickEmailNext() {
        webDriver.findElement(emailNext).click();
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    private void enterCandidatePassword() {
        webDriver.findElement(password).sendKeys(properties.getCandidatePassword());
    }

    private void clickPasswordNext() {
        webDriver.findElement(passwordNext).click();
    }

    private void accessAssessmentEmail() {
        webDriver.findElement(selectEmail).click();
    }

    private StartPage clickAssessmentLink() {
        webDriver.findElement(assessmentLink).click();
        return new StartPage(webDriver);
    }

    public void assessmentLinkInEmail(){
        goToGmailLoginPage();
        enterCandidateEmail();
        clickEmailNext();
        enterCandidatePassword();
        clickPasswordNext();
        accessAssessmentEmail();
    }

    public boolean isLinkInEmail(){
        return webDriver.findElement(assessmentLink).toString().contains("https://www.codingame.com/");
    }

    public void accessCandidateEmail(){
        goToGmailLoginPage();
        enterCandidateEmail();
        clickEmailNext();
        enterCandidatePassword();
        clickPasswordNext();
    }

    public boolean openAssessmentLinkEmail(){
        return webDriver.findElement(selectEmail).toString().contains("Sparta Global");
    }


    public StartPage accessAssessmentLinkFromEmail() {
        goToGmailLoginPage();
        enterCandidateEmail();
        clickEmailNext();
        enterCandidatePassword();
        clickPasswordNext();
        accessAssessmentEmail();
        return clickAssessmentLink();
    }
}
