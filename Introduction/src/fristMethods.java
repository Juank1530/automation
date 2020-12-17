import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class fristMethods {

	public static void main(String[] args) throws InterruptedException {
		
		By popupCloseLocator = By.xpath("//img[@src=\"https://assets.privy.com/assets/x-da8d2cc51c4426cc3ea5a20273576343cfa3a717812fa7182499685b95066541.svg\"]");
		
		//Here is where the conections is creating
		//System.setProperty("webdriver.chrome.driver", "/home/juantamara/Documents/webDriver/chromedriver");
		//WebDriver driver = new ChromeDriver ();
		System.setProperty("webdriver.chrome.driver", "/home/juantamara/Documents/webDriver/chromedriver");
		//Here is where is create a new object for use the browser 
		WebDriver driver = new ChromeDriver();
		//Here the windows is maximezed using selenium comands 
		driver.manage().window().maximize();
		//Here I'm Hiting url on the browser 
		driver.get("https://www.farmaciasmedicity.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.findElement(popupCloseLocator).click();
		System.out.println(driver.findElement(popupCloseLocator).getCssValue("width"));
		//driver.quit();
		
		//System.out.println(driver.getPageSource());
		driver.get("https://www.farmalisto.com.co/");
		//Go back in the navigation menu 
		driver.navigate().back();
		//Go forward in the navigation menu 
		driver.navigate().forward();
		
		//driver.close();// It closes current browser
		driver.quit();// It closes all thebrowser open by selenium

	}

}