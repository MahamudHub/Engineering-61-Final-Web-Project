package com.sparta.eng61.pageobjects.codingame;

import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;

import java.util.List;

public class StartPage {

    WebDriver webDriver;
    By startButton = new By.ByTagName("button");
    By termsButton = new By.ByClassName("c0134");
    By confirmStart = new By.ByClassName("c0129 c0131");

    public StartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public StartPage goToStartPage(){
        webDriver.manage().window().maximize();
        webDriver.get("https://www.codingame.com/evaluate/?id=39423207b45553a48499f30dfd16b00a97578aa");
        return this;
    }

    public void clickStartButton(){
        List<WebElement> elements = webDriver.findElements(By.tagName("button"));
        System.out.println(elements.get(0).getText());
        elements.get(0).click();
    }

    public void clickTermsBox(){
        webDriver.findElement(termsButton).click();
    }

    public void confirmStartTest(){
        webDriver.findElement(confirmStart).click();
    }

    public TestPage beginTest(){
        goToStartPage();
        clickStartButton();
        clickTermsBox();
        confirmStartTest();
        return new TestPage(webDriver);
    }










}
