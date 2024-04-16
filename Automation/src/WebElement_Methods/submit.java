package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
	
		WebElement search = driver.findElement(By.name("q"));	//xpath of search Bar

		search.sendKeys("Laptop");	//Fetching the attribute_value by using attribute_name of search bar
	
		search.submit();
		//submit() is work only if type="submit" attribute is present inside webElement source code
		
		Thread.sleep(3000);
		driver.close();
	}


}
