package SearchContext_Methods;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {
							
							// findElements() is used to identify multiple webElement
							// The return type is List<webElement>

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone",Keys.ENTER);
	
	//Fetching all details of the product name and price
		
		List<WebElement> Name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> Price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=1;i<=Name.size();i++)
			{
				System.out.println(i+" > "+Name.get(i).getText()+"________"+Price.get(i).getText());
			}
			
		driver.quit();
	    
	}

}
