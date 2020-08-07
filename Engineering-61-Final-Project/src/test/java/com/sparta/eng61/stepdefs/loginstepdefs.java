package com.sparta.eng61.stepdefs;

import com.sparta.eng61.pageobjects.dispatcher.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginstepdefs {
    WebDriver webDriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(webDriver);
    @Given("I enter the correct username")
    public void iEnterTheCorrectUsername() {
        loginPage.enterUsername();
    }
    @And("I enter the correct password")
    public void iEnterTheCorrectPassword() {
        loginPage.enterPassword();
    }
    @When("I click the LOGIN button")
    public void iClickTheLOGINButton() {
        loginPage.clickSubmitButton();
    }
    @Then("I will see the Send Assessment Page")
    public void iWillSeeTheSendAssessmentPage() {
        //Assertions.assertEquals("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openSendAssessPage().getURL());
    }

    @Given("I enter the wrong username")
    public void iEnterTheWrongUsername() {
        loginPage.enterWrongUsername();
    }

    @And("I enter the wrong password")
    public void iEnterTheWrongPassword() {
        loginPage.enterWrongPassword();
    }

    @Then("I will not see the Send Assessment Page")
    public void iWillNotSeeTheSendAssessmentPage() {
      //  Assertions.assertFalse("https://eng61.spartaglobal.academy/",loginPage.openLoginPage().login().openSendAssessPage().getURL());
    }

    @Given("I do not enter my credentials")
    public void iDoNotEnterMyCredentials() {
        
    }
}
