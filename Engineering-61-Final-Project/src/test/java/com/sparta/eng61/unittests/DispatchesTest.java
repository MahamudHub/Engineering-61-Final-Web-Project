package com.sparta.eng61.unittests;

import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DispatchesTest {
    WebDriver webDriver = new ChromeDriver();
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);
    //LoginPage loginPage = new LoginPage(webDriver);

    @Test
    public void openDispatches(){
        //loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
        webDriver.close();
    }

    @Test
    public void openandLogoutDispatches(){
        openDispatches();
        dispatchesPage.loggingOut();
        webDriver.close();

    }
    @Test
    public void clickDispatchesLink(){
        openDispatches();
        dispatchesPage.clickOnDispatchesPage();
        webDriver.close();

    }
    @Test
    public void clickResultsLink(){
        openDispatches();
        dispatchesPage.clickOnResultsPage();
        webDriver.close();

    }
    @Test
    public void clickPollsLink(){
        openDispatches();
        dispatchesPage.clickOnPollsPage();
        webDriver.close();

    }
    @Test
    public void clickLogoLink(){
        openDispatches();
        dispatchesPage.clickOnLogo();
        webDriver.close();

    }
    @Test
    public void fieldHeaders(){
        openDispatches();
        Assertions.assertEquals(true, dispatchesPage.fieldHeaders());
        webDriver.close();

    }
    @Test
    public void candidateName(){
        openDispatches();
        Assertions.assertEquals("Sam",dispatchesPage.getCandidateName());
        webDriver.close();

    }
    @Test
    public void candidateEmail(){
        openDispatches();
        Assertions.assertEquals("engcandidate61@gmail.com",dispatchesPage.getCandidateEmail());
        webDriver.close();
    }
    @Test
    public void recruiteremail(){
        openDispatches();
        Assertions.assertEquals("engineeringsixtyone@gmail.com",dispatchesPage.getRecruiterEmail());
        webDriver.close();
    }
    @Test
    public void assessment(){
        openDispatches();
        Assertions.assertEquals("java",dispatchesPage.getAssessmentType());
        webDriver.close();
    }
    @Test
    public void testid(){
        openDispatches();
        Assertions.assertEquals("3944770",dispatchesPage.getTestId());
        webDriver.close();
    }
    @Test
    public void timesent(){
        openDispatches();
        Assertions.assertEquals("August 5th 2020, 4:46:38 pm",dispatchesPage.getTimeSent());
        webDriver.close();
    }
    @Test
    public void Complete(){
        openDispatches();
        Assertions.assertEquals("No",dispatchesPage.getComplete());
        webDriver.close();

    }@Test
    public void Expired(){
        openDispatches();
        Assertions.assertEquals("No",dispatchesPage.getExpired());
        webDriver.close();

    }

}
