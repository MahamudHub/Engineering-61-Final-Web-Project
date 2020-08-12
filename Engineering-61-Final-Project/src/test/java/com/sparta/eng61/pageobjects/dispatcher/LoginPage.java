package com.sparta.eng61.pageobjects.dispatcher;

import com.sparta.eng61.propertiesloader.PropertiesFileLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver webDriver;

    By username  =  new By.ByName("username");
    By password = new By.ByName("password");
    By submit = new By.ByName("submit");
    By logoLink = new By.ByClassName("logoHeader");
    PropertiesFileLoader propertiesFileLoader = new PropertiesFileLoader();

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public LoginPage openLoginPage () {
        webDriver.manage().window();
        webDriver.get("https://eng61.spartaglobal.academy/login");
        return this;
    }

    public LoginPage reopenLoginPage () {
        webDriver.manage().window();
        webDriver.get("https://eng61.spartaglobal.academy/login");
        webDriver.switchTo().alert().accept();
        return this;
    }
    //right credentials
    public void enterUsername () {
        webDriver.findElement(username).sendKeys(propertiesFileLoader.getUsername());
    }
    public void enterPassword () {
        webDriver.findElement(password).sendKeys(propertiesFileLoader.getPassword());
    }

    //wrong credentials
    public void enterWrongUsername () {
        webDriver.findElement(username).sendKeys("admi");
    }
    public void enterWrongPassword () {
        webDriver.findElement(password).sendKeys("!Eng6");
    }


    //submit button
    public void clickSubmitButton () {
        webDriver.findElement(submit).click();
    }

    //logo header Link
    public void clickLogoLink(){
        webDriver.findElement(logoLink).click();
    }
    //error message if wrong credentials input
    public boolean isLoginErrorMessageCorrect () {
        return webDriver.getPageSource().contains("Incorrect password, please try to login again!");
    }
    //no token
    public boolean isTokenErrorMessageCorrect(){
        return webDriver.getPageSource().contains("No token provided, please login to access this page!");
    }

    //======Testing methods========

    //-------------Blank username or password---------------

    //submitting username but no password
    public void enterLoginUsername() {
        openLoginPage();
        enterUsername();
        clickSubmitButton();
    }
    //submitting no username but right password
    public void enterLoginPassword() {
        openLoginPage();
        enterPassword();
        clickSubmitButton();
    }
    //submitting no username and no password
    public void enterNoInfo () {
        openLoginPage();
        clickSubmitButton();
    }

    //------------------Correct username and password-------------
    public void enterRightLoginCredentials() {
        openLoginPage();
        enterUsername();
        enterPassword();
        clickSubmitButton();
    }


    //---------------submitting wrong username and right password------------
    public void enterWrongLoginUsername () {
        openLoginPage();
        enterWrongUsername();
        enterPassword();
        clickSubmitButton();
    }

    //-----------------submitting right username and wrong password-----------
    public void enterWrongLoginPassword () {
        openLoginPage();
        enterUsername();
        enterWrongPassword();
        clickSubmitButton();
    }


    //------------------login directs to new page-------------------
    public SendAssessmentPage login(){
        openLoginPage();
        enterUsername();
        enterPassword();
        clickSubmitButton();
        return new SendAssessmentPage(webDriver);
    }
    public SendAssessmentPage relogin(){
        reopenLoginPage();
        enterUsername();
        enterPassword();
        clickSubmitButton();
        return new SendAssessmentPage(webDriver);
    }



}