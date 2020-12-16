import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pruebaFormulario {

     public static void main(String[] args) {
			
	// Creamos una instancia de FirefoxDriver
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\juan.tamara\\Desktop\\Selenium\\browserDrivers\\webdriver_win\\chromedriver.exe");
 	WebDriver driver = new ChromeDriver ();;
			 
	// Definimos dos variables para almacenar el momento en que comienza y finaliza la prueba
	long time_start, time_end;
			 
	String web = "http://www.amazon.es";
	System.out.println("Entrando a: " + web);
			 
	time_start = System.currentTimeMillis();
	driver.get(web);
			 
	System.out.println("Carga de: " + web + "finalizada");
			 
	//Maximizamos la ventana 
	driver.manage().window().maximize();
			 
	//Pulsamos el botón para logarnos en la web
	driver.findElement(By.xpath("//span[@class=\"nav-line-2 nav-long-width\"]")).click();
			 
	 System.out.println("Botón Identificarse pulsado");
			 
	 //Buscamos el elemento para introducir el usuario
	 WebElement element;
	 element = driver.findElement(By.id("ap_email"));
	 element.sendKeys("aaaa@gmail.com");
	 
	 //Pulsamos el boton de continuar 
	 driver.findElement(By.id("continue")).click();

	 
	 
	 
	 System.out.println("Email introducido");
			 
	 //Buscamos el elemento para introducir la  contraseña
	  WebElement element2;
	  element2 = driver.findElement(By.id("ap_password"));
          //Introducimos la contraseña
	  element2.sendKeys("prueba");
			 
	  System.out.println("Contraseña introducida");
			 
	 //Pulsamos botón para logarnos
	 driver.findElement(By.id("signInSubmit")).click();
			 
	 System.out.println("Login completado en: " + web);
			 
	 time_end = System.currentTimeMillis();
	 double  time_total= time_end - time_start;
	 System.out.println("El tiempo tomado ha sido: "+ (time_total) +" ms");
	 System.out.println("El tiempo tomado ha sido: "+ (time_total/1000) +" s");

	}

}