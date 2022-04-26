package ru.test.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/ru.test/cucumber/features",
        glue = "src/test/java/ru.test/cucumber/steps", dryRun = true)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
