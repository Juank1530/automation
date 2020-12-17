import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3I_Explorer {

	public static void main(String[] args) {
		
		//Here all Selenium code
		
		//Invoke .exe file browser 
		System.setProperty("webdriver.chrome.driver", "/home/juantamara/Documents/webDriver/chromedriver");
		//create a Driver object Google
		WebDriver driver = new InternetExplorerDriver();
		
		//Wiht driver objecto is possible access to the selenium methops
		
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}

}
