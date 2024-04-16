package Locator_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByContains {
	
								/*
									 1>	tagName[contains(@AttributeName,'AttributeValue')]
									 						&
									 2>	tagName[contains(text(),'Visible_Text')]
								 */
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//img[contains(@alt,'burger')]")).click();		// 1>
		
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'burgers')]"));	// 2>
		System.out.println(text.getText());
		
		}

}
