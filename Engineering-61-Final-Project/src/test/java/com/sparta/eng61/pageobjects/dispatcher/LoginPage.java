package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoginPage {
    public Properties properties = new Properties();
    WebDriver webDriver;
    By username  =  new By.ByName("username");
    By password = new By.ByName("password");
    By submit = new By.ByName("submit");
    By error = new By.ById("error");
    By logOutLink = new By.ById("logout_link");

public void propertiesAccess() {
    try {
        String path = "src\\test\\resources\\login.properties";
        properties.load(new FileReader(path));
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public LoginPage openLoginPage () {
        webDriver.manage().window();
        webDriver.get("https://eng61.spartaglobal.academy/login");
        return this;
    }
    //right credentials
    public void enterUsername () {
        System.out.println(properties.getProperty("username").getClass());
        webDriver.findElement(username).sendKeys(properties.getProperty("username"));
    }
    public void enterPassword () {
        webDriver.findElement(password).sendKeys(properties.getProperty("password"));
    }

    //wrong credentials
    public void enterWrongUsername () {
        webDriver.findElement(username).sendKeys(properties.getProperty("incorrectUsername"));
    }
    public void enterWrongPassword () {
        webDriver.findElement(password).sendKeys(properties.getProperty("incorrectPassword"));
    }

    //submit button
    public void clickSubmitButton () {
        webDriver.findElement(submit).click();
    }

    //error message if wrong credentials input
    public boolean errorMessage () {
        boolean errorExists = webDriver.getPageSource().contains("Incorrect password, please try to login again!");
        return errorExists;
    }
    //login directs to new page
//    public SendAssessmentPage login(){
//        enterUsername();
//        enterPassword();
//        clickSubmitButton();
//        return new SendAssessmentPage(webDriver);
//    }

    //submitting right username and right password
    public void submitRightCredentials () {
        enterUsername();
        enterPassword();
        clickSubmitButton();
    }
    //submitting wrong username and right password

    public void submitWrongUsername () {
        enterWrongUsername();
        enterPassword();
        clickSubmitButton();
    }
    //submitting right username and wrong password

    public void submitWrongPassword () {
        enterUsername();
        enterWrongPassword();
        clickSubmitButton();
    }
    //submitting no username and no password
    public void submitNoInfo () {
        clickSubmitButton();
    }
    //submitting username but no password
    public void submitonlyUsername () {
        enterUsername();
        clickSubmitButton();
    }
    //submitting no username but right password
    public void submitonlyPassword () {
        enterPassword();
        clickSubmitButton();
    }

    //Logout from dispaches
    //Logout from Results
    //Logout from polls

}
