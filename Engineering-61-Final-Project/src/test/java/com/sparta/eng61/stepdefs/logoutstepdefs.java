package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class logoutstepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    @Given("I am on the Send Assessment page")
    public void iAmOnTheSendAssessmentPage(){
        //  Assertions.assertFalse("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openSendAssessmentPage().getURL());
    }
    @Given("I am on the Dispatches page")
    public void iAmOnTheDispatchesPage() {
        //  Assertions.assertFalse("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openDispatchesPage().getURL());

    }

    @Given("I am on the Results page")
    public void iAmOnTheResultsPage() {
        //  Assertions.assertFalse("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openResultsPage().getURL());

    }

    @Given("I am on the Polls page")
    public void iAmOnThePollsPage() {
        //  Assertions.assertFalse("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openPollsPage().getURL());
    }

    @When("I click the Logout link")
    public void iClickTheLogoutLink() {

    }

    @Then("I will see the Logout page")
    public void iWillSeeTheLogoutPage() {
    }


}
