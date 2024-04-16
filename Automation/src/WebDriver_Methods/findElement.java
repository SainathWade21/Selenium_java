package WebDriver_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {	
	
							// findElement() is used to identify single webElement
							// The return type is webElement only

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/login");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sainathwade384@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
			