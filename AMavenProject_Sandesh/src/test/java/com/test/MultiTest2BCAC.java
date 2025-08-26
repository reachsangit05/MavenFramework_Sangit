package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest2BCAC {
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
	
	@Test(priority=1)
	public void SelectDropDown(){
		WebElement dropdownoption = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(dropdownoption);
		sel.selectByIndex(4);
		sel.selectByValue("search-alias=beauty");
		sel.selectByVisibleText("Deals");
		}
	
	@Test(priority=2)
	public void AdvanceDropDown() throws InterruptedException {
		WebElement amazondropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(amazondropdown);
		List<WebElement> li = sel.getOptions();
		System.out.println(li.size());
		
		for (int i=0; i<=45; i++) { //error for i<=45 vs i<45
			li.get(i).click();
			System.out.println(li.get(i).getText());
			
		}
		
	}
	
	@Test(priority=3)
	public void AdvanceDropDown2() throws InterruptedException {
		WebElement amazondropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(amazondropdown);
		List<WebElement> li = sel.getOptions();
		System.out.println(li.size());
		
		for (int i=0; i<=45; i++) { //error for i<=45 vs i<45
			li.get(i).click();
			System.out.println(li.get(i).getText());
			
		}
		
	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}
}
