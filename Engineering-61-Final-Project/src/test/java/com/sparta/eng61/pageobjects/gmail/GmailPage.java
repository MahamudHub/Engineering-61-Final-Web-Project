package com.sparta.eng61.pageobjects.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailPage {
    
    WebDriver webDriver;
    By email = new By.ById("identifierId");
    By emailNext = new By.ByCssSelector("#identifierNext > div > button");
    By password = new By.ByName("password");
    By passwordNext = new By.ByCssSelector("#passwordNext > div > button");

    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public GmailPage goToLoginPage() {
        webDriver.manage().window().maximize();
        webDriver.get("http://mail.google.com/mail?hl=en-GB");
        return this;
    }


    public void enterEmail() {
        webDriver.findElement(email).sendKeys("engcandidate61@gmail.com");
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

    public void emailLogin() {
            goToLoginPage();
            enterEmail();
            clickEmailNext();
            enterPassword();
            clickPasswordNext();
    }
}
