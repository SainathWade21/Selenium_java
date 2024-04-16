package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenWebElement {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		
		WebElement gender = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Transgender'", gender);
		
	}
	
}
