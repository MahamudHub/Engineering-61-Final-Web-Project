package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecruiterStepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    DispatchesPage dispatchesPage = new DispatchesPage(webDriver);

    @Given("A recruiter has contacted a candidate")
    public void aRecruiterHasContactedACandidate() {
    }

    @When("I go to the dispatches page and see Recruiter")
    public void iGoToTheDispatchesPageAndSeeRecruiter() {
        loginPage.enterRightLoginCredentials();
        dispatchesPage.openDispatchesPage();
    }

    @Then("I should see the recruiter's email")
    public void iShouldSeeTheRecruiterSEmail() {
        Assertions.assertEquals("engineeringsixtyone@gmail.com",dispatchesPage.getRecruiterEmail());
    }
}
