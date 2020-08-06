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

    public GmailPage goToLoginPage() {
        webDriver.manage().window().maximize();
        webDriver.get("http://mail.google.com/mail?hl=en-GB");
        return this;
    }

    public void enterEmail() {
        properties.loadPropertiesFile();
        webDriver.findElement(emailAddress).sendKeys(properties.getCandidateEmail());
    }

    public void clickEmailNext() {
        webDriver.findElement(emailNext).click();
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    public void enterPassword() {
        properties.loadPropertiesFile();
        webDriver.findElement(password).sendKeys(properties.getCandidatePassword());
    }

    public void clickPasswordNext() {
        webDriver.findElement(passwordNext).click();
    }

    public void accessEmail() {
        webDriver.findElement(selectEmail).click();
    }

    public void clickLink() {
        webDriver.findElement(assessmentLink).click();
    }

    public void accessAssessmentLinkFromEmail() {
        goToLoginPage();
        enterEmail();
        clickEmailNext();
        enterPassword();
        clickPasswordNext();
        accessEmail();
        clickLink();
    }
}
