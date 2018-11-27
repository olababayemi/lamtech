package com.ola.lamtech.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                 glue = {"com.ola.lamtech.stepDef","com.ola.lamtech,cucumber"},
                 tags = {"@sanity"}


)
public class TestRunner {





}
