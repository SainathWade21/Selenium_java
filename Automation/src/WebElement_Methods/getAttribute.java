package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
	
	//xpath of search Bar
		WebElement search = driver.findElement(By.name("q"));

		String AV = search.getAttribute("placeholder");	//Fetching the attribute_value by using attribute_name of search bar
	
		System.out.println(AV);
		
		Thread.sleep(3000);
		driver.close();
	}


}
