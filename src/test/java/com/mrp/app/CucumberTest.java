package com.mrp.app;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import org.springframework.test.context.TestPropertySource;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        glue = {"com.mrp.app.domain.championship.steps", "com.mrp.app.configurations"},
        plugin = {"pretty", "html:target/cucumber-report.html"})
//@TestPropertySource("classpath:application.properties")
public class CucumberTest {

}