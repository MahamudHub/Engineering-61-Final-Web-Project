package com.sparta.eng61.pageobjects.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPage {
    
    WebDriver webDriver;
    By emailAddress = new By.ById("identifierId");
    By emailNext = new By.ByCssSelector("#identifierNext > div > button");
    By password = new By.ByName("password");
    By passwordNext = new By.ByCssSelector("#passwordNext > div > button");
    By selectEmail = new By.ByCssSelector("#\\3A 2t .yP");
    By assessmentLink = new By.ByPartialLinkText("https://www.codingame.com/");

    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public GmailPage goToLoginPage() {
        webDriver.manage().window().maximize();
        webDriver.get("http://mail.google.com/mail?hl=en-GB");
        return this;
    }


    public void enterEmail() {
        webDriver.findElement(emailAddress).sendKeys("engcandidate61@gmail.com");
    }

    public void clickEmailNext() {
        webDriver.findElement(emailNext).click();
    }

    public void enterPassword() {
        webDriver.findElement(password).sendKeys("Engsixty1");
    }

    public void clickPasswordNext() {
        webDriver.findElement(passwordNext).click();
    }



    public void accessEmail(){
        webDriver.findElement(selectEmail).click();
    }

    public void clickLink(){
        webDriver.findElement(assessmentLink).click();
    }

    public void accessAssessmentLinkFromEmail() {

        //try {
            goToLoginPage();
            enterEmail();
            clickEmailNext();
            //webDriver.wait(100);
            enterPassword();
            clickPasswordNext();
            accessEmail();
            clickLink();
        //} catch (InterruptedException e) {
            //e.printStackTrace();
        }

    }
//}
