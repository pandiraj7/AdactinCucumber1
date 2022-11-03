package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",glue="com.adactin.stepdefinition")
public class Runner_Class {
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\D E L L\\SeleniumWorkSpace\\AdactinCucumber1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public static void finishProgram() {
		
		driver.close();
	}
	
	
	
	
	

}
