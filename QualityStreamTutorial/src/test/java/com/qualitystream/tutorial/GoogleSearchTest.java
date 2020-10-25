package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	private WebDriver driver;

	@Before
	public void SetUp() {
		//For linux
		//System.setProperty("webdriver.chrome.driver", "./src\test\resources\chromedriver_linux\chromedriver");
		//For windows 
		System.setProperty("webdriver.chrome.driver", "./src\\test\\resources\\webdriver_win\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://farmalisto:Farma19*@test.farmalisto.com.co/");
		//driver.get("https://test.farmalisto.com.co/");

	}

	@Test
	public void testGooglePage() {
		//WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.clear();
		//searchbox.sendKeys("farmalisto");
		//searchbox.submit();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		assertEquals("Droguer�a Virtual A Domicilio- 24 Horas Online En Colombia", driver.getTitle());
		
		//WebElement searchbox = driver.findElement(By.id("df-searchbox__dffullscreen"));
		//searchbox.clear();
		//searchbox.sendKeys("Advil");
		//searchbox.submit();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		//driver.quit();

	}

}



