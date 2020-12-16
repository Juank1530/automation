import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1Google {

	public static void main(String[] args) {
		
		//Here all Selenium code
		
		//Invoke .exe file browser 
		//To linux
		//System.setProperty("webdriver.chrome.driver", "/home/juantamara/Documents/webDriver/chromedriver");
		//create a Driver object Google
		System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\juan.tamara\\Desktop\\Selenium\\browserDrivers\\webdriver_win\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver ();
		
		//Wiht driver objecto is possible access to the selenium methops
		
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}

}
