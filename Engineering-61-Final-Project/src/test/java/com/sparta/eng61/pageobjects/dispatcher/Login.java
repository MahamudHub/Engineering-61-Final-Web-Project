package com.sparta.eng61.pageobjects.dispatcher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver webDriver;

    public Login(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public String allowLogin(){
        return webDriver.getCurrentUrl();
    }
}
