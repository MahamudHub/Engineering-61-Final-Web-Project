package com.sparta.eng61.pageobjects.dispatcher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);

    //        @Test
//        public void openLogpage(){
//            loginPage.openLoginPage();
//            loginPage.login();
//        }
    @Test
    public void enterRightCredentials(){
        loginPage.openLoginPage();
        loginPage.submitRightCredentials();
    }
    @Test
    public void enterWrongUsername(){
        loginPage.openLoginPage();
        loginPage.submitWrongUsername();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }
    @Test
    public void enterWrongPassword(){
        loginPage.openLoginPage();
        loginPage.submitWrongPassword();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }
    @Test
    public void enterNoInfo(){
        loginPage.openLoginPage();
        loginPage.submitNoInfo();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }


//
//    @Test
//    @DisplayName("check Login Page Opens")
//    public void inputUsername(){
//        loginPage.openLoginPage();
////        String loginURL = webDriver.getCurrentUrl();
//        Assertions.assertEquals("https://eng61.spartaglobal.academy/",loginPage.login());
//
////
//  }
}
