package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SetUp {
WebDriver driver ;
	
	@BeforeClass
	public void initialisation() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterClass
	public void CleanUp() {
		driver.quit();
	}
}
