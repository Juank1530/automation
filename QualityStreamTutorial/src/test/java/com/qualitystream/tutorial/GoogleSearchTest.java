package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	private WebDriver driver;
	
	By registerLinkLocator = By.className("login");
	By registerPageLocator = By.className("box-account");
	By emailLocator = By.id("email-register");
	By nameLocator = By.name("firstname");
	By lastNameLocator = By.name("lastname");
	By passwordLocator = By.name("passwd");
	By repasswordLocator = By.name("repassword");
	By checkLocator = By.xpath("//label[@for=\"TOSreg\"]");
	By btnRegistrer = By.id("btn-register");
	By logOutLocator = By.className("logout");
	
	

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
	public void openHomePage() throws InterruptedException {
		//WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.clear();
		//searchbox.sendKeys("farmalisto");
		//searchbox.submit();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		assertEquals("Droguería Virtual A Domicilio- 24 Horas Online En Colombia", driver.getTitle());

		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//Thread.sleep(6000);
		
		/*while () {
			
		}*/
		int mail = 8;
		for (int i = 0; i < 3; i++) {
			
			Thread.sleep(6000);
			driver.findElement(registerLinkLocator).click();
			Thread.sleep(6000);				
			if (driver.findElement(registerPageLocator).isDisplayed()) {
				driver.findElement(emailLocator).sendKeys("juan.tamara@"+mail+".com.co");
				driver.findElement(nameLocator).sendKeys("Juank Test");
				driver.findElement(lastNameLocator).sendKeys("Tamara");
				driver.findElement(passwordLocator).sendKeys("12345678");
				driver.findElement(repasswordLocator).sendKeys("12345678");
				driver.findElement(checkLocator).click();
				driver.findElement(btnRegistrer).click();
				Thread.sleep(20000);
				driver.findElement(logOutLocator).click();
				mail++;
			} else {
				
				System.out.println("No se confrimo el regsitro");

			}
			
		}
		

		
		
		
		
		//WebElement searchbox = driver.findElement(By.id("df-searchbox__dffullscreen"));
		//searchbox.clear();
		//searchbox.sendKeys("Advil");
		//searchbox.submit();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	/*
	@Test
	public void RegistrerPage() throws InterruptedException {

	
	}*/

	@After
	public void tearDown() {
		//driver.quit();

	}

}



