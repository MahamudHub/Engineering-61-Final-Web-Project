package com.sparta.eng61;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/reporting/report.html",
                "json:target/reporting/report.json",
                "junit:target/reporting/report.xml"},
        tags = "",
        stepNotifications = true,
        dryRun = false
)
public class TestRunner {

}