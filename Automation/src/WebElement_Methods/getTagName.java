package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.name("login"));
		
		String tagName = button.getTagName();	//Fetching the tag-name of login button
		System.out.println(tagName);
		
		Thread.sleep(2000);
		driver.close();
	}

}
