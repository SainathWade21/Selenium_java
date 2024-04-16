package Synchronization_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	/*	Implicit wait is Global wait because we need to declare it only once 
		and it will applicable for all the findElement & findElements	
	*/	
		driver.get("https://www.swiggy.com/");
		
		WebElement biryani = driver.findElement(By.xpath("//a[@aria-label='restaurants curated for biryani']"));
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(biryani));
		
	/*	To use explicit wait we need to create object for WebDriverWait class
	 	and we need to pass the condition inside the explicit wait
	*/
		
		biryani.click();
		
		Thread.sleep(2000);
		driver.close();
}


}
