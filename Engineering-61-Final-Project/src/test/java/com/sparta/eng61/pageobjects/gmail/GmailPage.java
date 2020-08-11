package com.sparta.eng61.pageobjects.gmail;

//import com.sparta.eng61.helper.MultipleClickAttempt;
import com.sparta.eng61.propertiesloader.PropertiesFileLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import com.sparta.eng61.pageobjects.codingame.CodingamePage;

public class GmailPage {

    WebDriver webDriver;
    //MultipleClickAttempt multipleClickAttempt = new MultipleClickAttempt();
    By emailAddress = new By.ById("identifierId");
    By emailNext = new By.ByCssSelector("#identifierNext > div > button");
    By password = new By.ByName("password");
    By passwordNext = new By.ByCssSelector("#passwordNext > div > button");
    By selectEmail = new By.ByXPath("(//span[@name='Sparta Global'])[2]");
    By selectNewEmail = new By.ByCssSelector(".zF");
    By assessmentLink = new By.ByPartialLinkText("https://www.codingame.com/");
    PropertiesFileLoader properties = new PropertiesFileLoader();

    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public GmailPage goToGmailLoginPage() {
        webDriver.manage().window().maximize();
        webDriver.get("http://mail.google.com/mail?hl=en-GB");
        return this;
    }

    private void enterCandidateEmail() {
        webDriver.findElement(emailAddress).sendKeys(properties.getCandidateEmail());
    }

    private void clickEmailNext() {
        webDriver.findElement(emailNext).click();
        webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

    private void enterCandidatePassword() {
        webDriver.findElement(password).sendKeys(properties.getCandidatePassword());
    }

    private void clickPasswordNext() {
        webDriver.findElement(passwordNext).click();
    }

    private void accessAssessmentEmail() {
        webDriver.findElement(selectEmail).click();
    }
    public boolean selectassessmentEmail(By by) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                webDriver.findElement(by).click();
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }

    private CodingamePage clickAssessmentLink() {
        String url = webDriver.findElement(assessmentLink).getText();
        webDriver.get(url);
        return new CodingamePage(webDriver);
    }

    public void accessingAssessmentLinkInEmail(){
        goToGmailLoginPage();
        enterCandidateEmail();
        clickEmailNext();
        enterCandidatePassword();
        clickPasswordNext();
        accessAssessmentEmail();
    }

    public boolean isCodinGameLinkInEmail(){
        return webDriver.findElement(assessmentLink).toString().contains("https://www.codingame.com/");
    }

    public void accessCandidateEmail(){
        goToGmailLoginPage();
        enterCandidateEmail();
        clickEmailNext();
        enterCandidatePassword();
        clickPasswordNext();
    }

    public boolean openAssessmentLinkEmail(){
        return webDriver.findElement(selectEmail).toString().contains("Sparta Global");
    }


    public CodingamePage accessAssessmentLinkFromEmail() {
        goToGmailLoginPage();
        enterCandidateEmail();
        clickEmailNext();
        enterCandidatePassword();
        clickPasswordNext();
        selectassessmentEmail(selectNewEmail);
        return clickAssessmentLink();
    }
}
