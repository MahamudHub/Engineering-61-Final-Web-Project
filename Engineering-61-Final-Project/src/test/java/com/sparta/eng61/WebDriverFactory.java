package com.sparta.eng61;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    WebDriver webDriver;
    String browser;

    public WebDriver browserFactory(String selectBrowser) {
        browser = selectBrowser;
        switch (browser) {
            case "chrome":
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                webDriver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver","msedgedriver.exe");
                webDriver = new EdgeDriver();
                break;
        }
        return webDriver;
    }
}