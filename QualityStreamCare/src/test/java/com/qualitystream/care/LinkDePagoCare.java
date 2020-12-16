package com.qualitystream.care;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDePagoCare {

	private WebDriver driver;
	
	By homeImageLocator = By.id("_desktop_user_info");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://farmalisto:Farma19*@https:qa.care24.com.co/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void createOrder() {
		//driver.findElement(homeImageLocator); 
	}

}
