package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	
	//xpath of Login Button	
		WebElement button=driver.findElement(By.xpath("//button[@value='1']"));
		
	//Fetching & Printing the size of Login button	
		System.out.println(button.getSize());
		
		Thread.sleep(3000);
		driver.close();
	
	}
}
