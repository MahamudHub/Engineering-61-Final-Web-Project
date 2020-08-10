package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class logoutstepdefs {
    WebDriver webDriver = new ChromeDriver();
    By logOutLink = new By.ById("logout_link");
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage (webDriver);
    ResultsPage resultsPage = new ResultsPage(webDriver);
    PollsPage pollsPage = new PollsPage(webDriver);

    @Given("I am on the Send Assessment page")
    public void iAmOnTheSendAssessmentPage(){
        //  Assertions.assertTrue("https://eng61.spartaglobal.academy/",sendAssessmentPage.getURL());
    }
    @Given("I am on the Dispatches page")
    public void iAmOnTheDispatchesPage() {
        //  Assertions.assertTrue("https://eng61.spartaglobal.academy/",dispatchesPage.getURL());
    }

    @Given("I am on the Results page")
    public void iAmOnTheResultsPage() {
        //  Assertions.assertTrue("https://eng61.spartaglobal.academy/",resultsPage.getURL());
    }

    @Given("I am on the Polls page")
    public void iAmOnThePollsPage() {
        //  Assertions.assertTrue("https://eng61.spartaglobal.academy/",pollsPage.getURL());
    }

    @When("I click the Logout link")
    public void iClickTheLogoutLink() {
    webDriver.findElement(logOutLink).click();
    }

    @Then("I will see the Logout page")
    public boolean iWillSeeTheLogoutPage() {
        return webDriver.getPageSource().contains("You have successfully signed out!");
    }


}
