package com.mrp.app;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/championship",
        glue = {"com.mrp.app.domain.championship.steps", "com.mrp.app.configurations"},
        plugin = {"pretty", "html:target/cucumber-report.html"})
public class CucumberTests {

}