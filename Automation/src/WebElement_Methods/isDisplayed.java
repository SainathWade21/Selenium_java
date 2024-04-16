package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
		public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		WebElement img = driver.findElement(By.xpath("//img[@title='Flipkart']"));	//xpath of flipkart image
		
		System.out.println(img.isDisplayed());	//To check whether the given webElement is displayed or not
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
