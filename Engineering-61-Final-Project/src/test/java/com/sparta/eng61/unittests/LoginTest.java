package com.sparta.eng61.unittests;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.LogoutPage;
import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;
import com.sparta.eng61.pageobjects.dispatcher.ResultsPage;
import com.sparta.eng61.pageobjects.dispatcher.PollsPage;
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
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    LogoutPage logoutPage = new LogoutPage(webDriver);

    //=======TESTING LOGGING OUT============
    //------Logging out from the Dispatches page----------
    @Test
    public void logoutFromDispatches(){
        loginPage.enterRightLoginCredentials();
        dispatchesPage.logoutFromDispatches();
        Assertions.assertEquals(true,logoutPage.isLogoutSuccessFul());

    }
    //------Logging out from the Results page----------
    @Test
    public void logoutFromResults(){
        loginPage.enterRightLoginCredentials();
        resultsPage.logoutFromResults();
        Assertions.assertEquals(true,logoutPage.isLogoutSuccessFul());

    }
    //------Logging out from the Polls page----------

    @Test
    public void logoutFromPolls(){
        loginPage.enterRightLoginCredentials();
        pollsPage.logoutFromPolls();
        Assertions.assertEquals(true,logoutPage.isLogoutSuccessFul());
    }
    //------Logging out from the Send Assessment page----------

    @Test
    public void logoutFromSendAssessment(){
        loginPage.enterRightLoginCredentials();
        sendAssessmentPage.logoutFromSendAssessment();
        Assertions.assertEquals(true,logoutPage.isLogoutSuccessFul());
    }
    //---------Testing if logout page opens--------
    @Test
    public void openLogoutPage(){
        logoutPage.openLogoutPage();
    }

    //-------testing if login page directs to the Send Assessment page----------
    @Test
    public void successfullLogin(){
        Assertions.assertEquals("https://eng61.spartaglobal.academy/",sendAssessmentPage.openSendAssessmentPage().getUrl());
    }
//===========TESTING ENTERING FIELDS============

    //-----Testing right credentials input
    @Test
    public void enterRightCredentials(){
        loginPage.enterRightLoginCredentials();
        Assertions.assertEquals(false, loginPage.isLoginErrorMessageCorrect());
    }
    @Test
    public void enterWrongUsername(){
        loginPage.enterWrongUsername();
        Assertions.assertEquals(true, loginPage.isLoginErrorMessageCorrect());
    }
    @Test
    public void enterWrongPassword(){
        loginPage.enterWrongPassword();
        Assertions.assertEquals(true, loginPage.isLoginErrorMessageCorrect());
    }
    @Test
    public void enterNoInfo(){
        loginPage.enterNoInfo();
        Assertions.assertEquals(true, loginPage.isLoginErrorMessageCorrect());
    }
    @Test
    public void onlyUserName(){
        loginPage.enterLoginUsername();
        Assertions.assertEquals(true, loginPage.isLoginErrorMessageCorrect());
    }
    @Test
    public void onlyPassword(){
        loginPage.enterLoginPassword();
        Assertions.assertEquals(true, loginPage.isLoginErrorMessageCorrect());
    }
    //-----------Testing logo link-----------
    @Test
    public void clickLogoLink(){
        loginPage.openLoginPage();
        loginPage.clickLogoLink();
        Assertions.assertEquals(true, loginPage.isTokenErrorMessageCorrect());
    }

}