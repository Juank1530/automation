import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author juan.tamara
 *
 */
public class linkDePagoCare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src\\test\\resources\\webdriver_win\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://farmalisto:Farma19*@qa.care24.com.co/admin749zzfdw6/");

	}

}
