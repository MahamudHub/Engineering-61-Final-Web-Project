package com.sparta.eng61.pageobjects.dispatcher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    ResultsPage resultsPage = new ResultsPage(webDriver);
    PollsPage pollsPage = new PollsPage(webDriver);
    LogoutPage logoutPage = new LogoutPage(webDriver);

    //=======TESTING LOGGING OUT============
    //------Logging out from the Dispatches page----------
    @Test
    public void LoggingoutfromDispatches(){
        loginPage.submitRightCredentials();
        dispatchesPage.LogoutfromDispatches();
        Assertions.assertEquals(true,logoutPage.successfulLogout());

    }
    //------Logging out from the Results page----------
    @Test
    public void LoggingoutfromResults(){
        loginPage.submitRightCredentials();
        resultsPage.LogoutfromResults();
        Assertions.assertEquals(true,logoutPage.successfulLogout());

    }
    //------Logging out from the Polls page----------

    @Test
    public void LoggingoutfromPolls(){
        loginPage.submitRightCredentials();
        pollsPage.LogoutfromPolls();
        Assertions.assertEquals(true,logoutPage.successfulLogout());

    }
    //---------Testing if logout page opens--------
    @Test
    public void openLogoutPage(){
        logoutPage.openLogoutPage();
    }

    //-------testing if login page directs to the Send Assessment page----------
    @Test
    public void successfullLogin(){
        Assertions.assertEquals("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openSendAssessPage().getURL());
    }
//===========TESTING ENTERING FIELDS============

    //-----Testing right credentials input
    @Test
    public void enterRightCredentials(){
        loginPage.submitRightCredentials();
        Assertions.assertEquals(false, loginPage.errorMessage());
    }
    @Test
    public void enterWrongUsername(){
        loginPage.submitWrongUsername();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }
    @Test
    public void enterWrongPassword(){
        loginPage.submitWrongPassword();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }
    @Test
    public void enterNoInfo(){
        loginPage.submitNoInfo();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }
    @Test
    public void onlyUserName(){
        loginPage.submitonlyUsername();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }
    @Test
    public void onlyPassword(){
        loginPage.submitonlyPassword();
        Assertions.assertEquals(true, loginPage.errorMessage());
    }

}
