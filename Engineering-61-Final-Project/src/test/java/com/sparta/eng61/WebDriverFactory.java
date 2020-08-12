package com.sparta.eng61;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    static WebDriver webDriver;
    static String browser;

    public static WebDriver SelectDriver(String browserName) {
        browser = browserName;
        switch (browser) {
            case "Chrome":
                webDriver = new ChromeDriver();
                break;
            case "Firefox":
                webDriver = new FirefoxDriver();
                break;
            case "Edge":
                System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
                webDriver = new EdgeDriver();
                break;
        }
        return webDriver;
    }
}