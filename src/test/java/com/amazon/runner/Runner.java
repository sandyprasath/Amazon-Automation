package com.amazon.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BaseClasss;
import com.amazon.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\amazon\\feature", 
glue = "com\\amazon\\stepdefinition", plugin = "pretty", monochrome = true)

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		 driver = BaseClasss.getBrowser(browser);
	}
	
	
	
}
