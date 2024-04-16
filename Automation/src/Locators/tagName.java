package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//to launch the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify the name text field and pass the name
		WebElement element = driver.findElement(By.tagName("input"));
		
		element.sendKeys("books");
		
	}

}
