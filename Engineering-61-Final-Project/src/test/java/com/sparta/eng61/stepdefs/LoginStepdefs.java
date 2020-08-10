package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import com.sparta.eng61.pageobjects.dispatcher.DispatchesPage;
import com.sparta.eng61.pageobjects.dispatcher.SendAssessmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    SendAssessmentPage sendAssessmentPage = new SendAssessmentPage(webDriver);

    @Given("I enter the correct username")
    public void iEnterTheCorrectUsername() {
        loginPage.enterUsername();
    }
    @Given("I enter the wrong username")
    public void iEnterTheWrongUsername() {
        loginPage.enterWrongUsername();
    }
    @Given("I do not enter my credentials")
    public void iDoNotEnterMyCredentials() {
    }
    @And("I enter the correct password")
    public void iEnterTheCorrectPassword() {
        loginPage.enterPassword();
    }
    @And("I enter the wrong password")
    public void iEnterTheWrongPassword() {
        loginPage.enterWrongPassword();
    }
    @When("I click the LOGIN button")
    public void iClickTheLOGINButton() {
        loginPage.clickSubmitButton();
    }
    @Then("I will see the Send Assessment Page")
    public void iWillSeeTheSendAssessmentPage() {
        //Assertions.assertEquals("https://eng61.spartaglobal.academy/",sendAssessmentPage.getURL());
    }

    @Then("I will see the Error message")
    public void iWillSeeTheErrorMessage() {
        loginPage.isLoginErrorMessageCorrect();
    }
}
