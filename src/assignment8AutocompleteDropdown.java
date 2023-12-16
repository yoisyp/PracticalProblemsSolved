import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8AutocompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Autocompletar dropdown. Escribir tres letras del pais deseado, se muestran las coincidencias y se mueve el mouse para seleccionar el elegido, verificar que este aparece seleccionado en el editbox.

		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String place = "uni";//EEUU
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(place);
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.DOWN);
		//driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys(Keys.ENTER); //Para escoger el pais
		
		System.out.println(driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).getAttribute("value"));
		
	}

}
