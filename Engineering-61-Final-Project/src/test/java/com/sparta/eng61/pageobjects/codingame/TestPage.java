package com.sparta.eng61.pageobjects.codingame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {

    WebDriver webDriver;
    By firstQuestion = new By.ByClassName("c0179 c0190");

    public TestPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void clickAnswerQ1(){
        webDriver.findElement(firstQuestion).click();

    }


}
