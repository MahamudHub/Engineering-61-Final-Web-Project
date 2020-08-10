package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver webDriver;
    public LogoutPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public LogoutPage openLogoutPage () {
        webDriver.manage().window();
        webDriver.get("https://eng61.spartaglobal.academy/login?loggedout=true");
        return this;
    }
    public boolean isLogoutSuccessFul () {
        boolean successLogout = webDriver.getPageSource().contains("You have successfully signed out!");
        return successLogout;
    }
    public boolean isTokenErrorMessageCorrect(){
        return webDriver.getPageSource().contains("No token provided, please login to access this page!");
    }
}