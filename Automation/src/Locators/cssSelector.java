package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {       /* 
									tagName[AttributeName='AttributeValue']
								OR
									[AttributeName='AttributeValue']
								*/

	public static void main(String[] args) throws InterruptedException {

	// to launch the browser
		WebDriver driver = new ChromeDriver();

	// to maximize
		driver.manage().window().maximize();

	// to launch the web application
		driver.get("https://www.swiggy.com/");

		Thread.sleep(5000);

	// click on burger by using css selector
		driver.findElement(By.cssSelector("[alt*='for burger']")).click();
	}

}
