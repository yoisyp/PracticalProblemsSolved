import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignment7WebTables {

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//1. Imprimir cantidad de filas de la tabla
		List <WebElement> countRows = driver.findElements(By.cssSelector(".table-display tr")); //Almaceno lista con todas las filas de la tabla
		System.out.println("Rows: " + countRows.size());
		
		//2. Imprimir cantidad de columnas de la tabla
		List <WebElement> countColumns = driver.findElements(By.cssSelector(".table-display tr th")); //Almaceno lista con todas las columnas (th son columnas de la fila header) de la tabla
		System.out.println("Columns: " + countColumns.size());
		
		//3. Imprimir el contenido de la segunda fila 
		//Localizador para primera columna de la 3ra fila (".table-display tr:nth-child(3) td:nth-child(1)"))
		List <WebElement> row2 = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td")); //Lista de los 3 elementos (3 columnas) de la 3ra fila
		for (int i=0; i<row2.size(); i++)
		{
			System.out.println(row2.get(i).getText());
		}
						
	}

}
