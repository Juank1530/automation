import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2FireFox {

	public static void main(String[] args) {
		//Here all Selenium code
		
		//Invoke .exe file browser To can use Fire fox is necessary to get gecko driver 
		System.setProperty("webdriver.gecko.driver", "/home/juantamara/Documents/webDriver/geckodriver");
		//create a Driver object FireFox
		WebDriver driver = new FirefoxDriver();
		
		//Wiht driver objecto is possible access to the selenium methops
		
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
