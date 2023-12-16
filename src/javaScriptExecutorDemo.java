
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class javaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Class JavaScriptExecutor permite ejecutar cosas relacionadas con Java Script
		JavascriptExecutor js = (JavascriptExecutor)driver;//Creando objeto Java Script. Casting driver to JavascriptExecutor
		
		js.executeScript("window.scrollBy(0,500)");//Ejecuta movimiento del scroll, lo baja desde la posicion 0 a la 500
		Thread.sleep(3000);
		//document.querySelector('.tableFixHead') es localizador (en java script) de la tabla que deseo scrolar
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//Ejecuta el movimiento del scroll hacia abajo hasta que el top del scroll sea 500

		//How to handle table grids in webpage. 
		//1. Sumar todos las celdas de una columna
		List <WebElement> valuesTable = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); //Almaceno lista con todos los valores de la ultima columna de la tabla
		int sum = 0;		
		for (int i=0; i<valuesTable.size(); i++)
		{
			sum = sum + Integer.parseInt(valuesTable.get(i).getText()); //Convierto a entero el texto de cada celda
		}
		
		System.out.println(sum);
		
		//2. Comparar la sum obtenida con el valor "Total Amount Collected: 296" de la tabla
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		//Obtengo el valor  "Total Amount Collected: 296", aplico operaciones con cadena y obtengo string 296 la cual se convierte a entero
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split (":")[1].trim());
		
		Assert.assertEquals(sum, total);
	}

}
