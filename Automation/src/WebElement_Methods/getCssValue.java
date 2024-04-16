package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	
	
		WebElement search = driver.findElement(By.name("login"));	//xpath of login button

	//Fetching the CSS property of login button 
		String cssProperty = search.getCssValue("color");	//css property
	
		System.out.println(cssProperty);
		
		Thread.sleep(3000);
		driver.close();
	}

}
