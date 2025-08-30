package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SetUp {
WebDriver driver ;
Properties prop = new Properties();
	
	@BeforeClass
	public void initialisation() throws InterruptedException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Sandesh\\Documents\\GitConnection_Sangit\\MavenFramework_Sangit\\AMavenProject_Sandesh\\Properties\\config.properties");
		prop.load(fis);//load all properties data
		driver = new ChromeDriver();
		driver.get(prop.getProperty("QA_URL"));
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
