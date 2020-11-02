
public class care24IconsSize {

	public static void main(String[] args) throws InterruptedException {
		
		Size c = new Size();
		
		
		System.out.println("Home");
		c.getSize("https://www.care24.com.co");
		System.out.println("Categorias");
		c.getSize("https://www.care24.com.co/13-terapias");
		c.getSize("https://www.care24.com.co/content/32-telemedicina");
		c.getSize("https://www.care24.com.co/75-visitas-medicas");
		c.getSize("https://www.care24.com.co/129-covid-19");
		c.getSize("https://www.care24.com.co/25-enfermeria");
		c.getSize("https://www.care24.com.co/123-vida-saludable");
		
		System.out.println("Productos");
		c.getSize("https://www.care24.com.co/telemedicina/806-medico-general-por-telemedicina.html");
		c.getSize("https://www.care24.com.co/pediatria/305-pediatria.html");
		c.getSize("https://www.care24.com.co/terapias/10-terapia-fisica.html");
		c.getSize("https://www.care24.com.co/covid-19/805-prueba-rapida-covid-19.html");
		c.getSize("https://www.care24.com.co/visita-medica/20-curacion-por-valoracion.html");
		c.getSize("https://www.care24.com.co/visitas-medicas/179-traslado-en-ambulancia-basica-sencillo.html");
		
		System.out.println("Carrito");
		c.getSize("https://www.care24.com.co/carrito?action=show");
		  
		

		
		
		
		
		
		

		

		
				
		


	}

}
