import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size{
	
	public void getSize(String url) {
		
		System.setProperty("webdriver.chrome.driver", "/home/juantamara/Documents/webDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		By searchBntLocator = By.xpath("//button[@class=\"js-search-btn-toggle search-btn-toggle font-search df-search-btn\"]");
		By bagBntLocator = By.className("font-bag");
		By contactBntLocator = By.className("header__contact__item");
		By phoneBntLocator = By.className("font-phone-call");
		
		//By phoneBntLocator = By.className("shop-phone header__contact__item");
		
		driver.get(url); 
		driver.manage().window().maximize();
		
		url = driver.getCurrentUrl();
		String Text = "El tamaño del icono ";
		
		String search = driver.findElement(searchBntLocator).getCssValue("font-size");
		String nameSearch = driver.findElement(searchBntLocator).getAttribute("class");
		System.out.println(Text+nameSearch+" en la página "+url+" es de "+search);
		
		String bag = driver.findElement(bagBntLocator).getCssValue("font-size");
		String nameBag = driver.findElement(bagBntLocator).getAttribute("class");
		System.out.println(Text+nameBag+" en la página "+url+" es de "+bag);
		
		String mail = driver.findElement(contactBntLocator).getCssValue("font-size");
		String nameMail = driver.findElement(contactBntLocator).getAttribute("class");
		System.out.println(Text+nameMail+" en la página "+url+" es de "+mail);
		
		String phone = driver.findElement(phoneBntLocator).getCssValue("font-size");
		String namePhone = driver.findElement(phoneBntLocator).getAttribute("class");
		System.out.println(Text+namePhone+" en la página "+url+" es de "+phone);
		
		driver.quit();
		
	}
	
	public void addPorduct(String url) throws InterruptedException {
		
		By addTocartLocator = By.className("add");
		
		System.setProperty("webdriver.chrome.driver", "/home/juantamara/Documents/webDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(4000);
		driver.findElement(addTocartLocator).click();
		//driver.quit();
		getSize(url);
		
	}
	

	

	
	

}
