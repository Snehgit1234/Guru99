package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"E:\\SnehalEclipseWorkspace\\Guru99applicationBDD\\feature\\Guru99.feature"},
		glue= {"com.StepDefination"},
		dryRun=true
		
		
		)
public class TestRunner {

}
