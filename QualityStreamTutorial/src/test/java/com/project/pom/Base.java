package com.project.pom;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// This is the base class
public class Base {

	//This is a Object Web driver
	private WebDriver driver;
	
	//This is the class constructor  
	public Base (WebDriver driver) {
		this.driver = driver;
	}
	
	//This is the method to conect wiht chrome web driver
	public WebDriver chromeDriverConnection() {
		//Here is set the driver to open a new instance for chrome to do the tests 
		System.setProperty("webdriver.chrome.driver", "./src\\test\\resources\\webdriver_win\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	//Those are the wrappings to Selenium functions
	
	public WebElement findWebElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public List findElements(By locator){
		return (List) driver.findElements(locator);
	} 
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	//This is a override to the wraper getText 
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	} 
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	
	
	
	
	
}
