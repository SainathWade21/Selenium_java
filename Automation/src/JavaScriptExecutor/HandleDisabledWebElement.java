package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		// Explicit TypeCasting
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		//Passing value in disabled name text-field
		jsExecutor.executeScript("document.getElementById('name').value='SAI';");
		
/*	OR
		WebElement name = driver.findElement(By.id("name"));
		jsExecutor.executeScript("arguments[0].value='SAI';",name);
*/

		//Passing value in disabled email text-field
		jsExecutor.executeScript("document.getElementById('email').value='sainath@gmail.com';");
		
		//Passing value in disabled password text-field
		jsExecutor.executeScript("document.getElementById('password').value='abc#123';");
		
				
		
	}
	

}
