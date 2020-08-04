package com.sparta.eng61;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main( String[] args ) {
        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https://eng61.spartaglobal.academy/login");    }
}
