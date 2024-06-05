package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Rekha M\\eclipse-workspace\\new\\Cucumber1\\src\\test\\java\\com\\feature",
glue = "com.stepdefinition",
dryRun = false,
tags = "@tag2")
public class RunnerClass {

}
