package com.sparta.eng61.pageobjects.gmail;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
    WebDriver webDriver = new ChromeDriver();
    GmailPage gmailLogin = new GmailPage(webDriver);

    @Test
    public void LoggingIn() {
        gmailLogin.goToLoginPage();
        gmailLogin.emailLogin();
    }
}
