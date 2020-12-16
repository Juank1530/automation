import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bind.annotation.FieldProxy;


public class Linkdepago {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		
		String mail = "juan.tamara@farmalisto.com.co";
		String pass = "Juan.tamara1530";
		String urlback  = "https://farmalisto:Farma19*@qa.care24.com.co/admin749zzfdw6/index.php?controller=AdminLogin&token=355640813ba9f95037aae7ad0b9a4c69&redirect=AdminDashboard";
		String urlFront = "https://farmalisto:Farma19*@qa.care24.com.co/";
		
		WebDriver driver;
		
		By emailLocator = By.id("email");
		By passLocator = By.id("passwd"); 
		By btnSubmit = By.name("submitLogin");
		By btnOrders = By.xpath("//i[@class=\"material-icons mi-shopping_basket\"]");
		By btnordersL2 = By.xpath("//li[@class=\"link-leveltwo \"]");
		By btnNewOrder = By.id("page-header-desc-order-new_order");
		By FieldCustomer = By.id("customer");
		By btnChoose = By.id("choose_customer_btn");
		By fieldProduct = By.id("product");
		By btnAdd = By.id("submitAddProduct");
		By btnSaleschanel = By.id("id-sales-channel");
		By orderMessage = By.id("order_message");
		By payLink = By.id("go_order_process");
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan.tamara\\Desktop\\Selenium\\browserDrivers\\webdriver_win\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlback);
		driver.findElement(emailLocator).sendKeys(mail);
		driver.findElement(passLocator).sendKeys(pass);
		driver.findElement(btnSubmit).click();
		Thread.sleep(7000);
		driver.findElement(btnOrders).click();
		driver.findElement(btnordersL2).click();
		Thread.sleep(7000);
		driver.findElement(btnNewOrder).click();
		Thread.sleep(3000);
		driver.findElement(FieldCustomer).sendKeys(mail);
		Thread.sleep(4000);
		driver.findElement(btnChoose).click();
		Thread.sleep(7000);
		driver.findElement(fieldProduct).sendKeys("visita médica domiciliaria");
		Thread.sleep(4000);
		driver.findElement(btnAdd).click();
		Thread.sleep(4000);
		driver.findElement(btnSaleschanel).sendKeys("Llamada");	
		driver.findElement(orderMessage).sendKeys("Pedido realizado por la automatización");	
		driver.findElement(payLink).click();
		String myWindowHandle = driver.getWindowHandle();
		System.out.println(myWindowHandle);
		
		



	}

}
	
