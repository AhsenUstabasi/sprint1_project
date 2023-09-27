package com.sprint1.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/sprint1/stepDefinitions",
        dryRun = false,
        tags = "@SCRUM-1266",
       plugin ="json:target/cucumber.json"
)


public class CukesRunner {
}

