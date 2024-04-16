package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAxes_Dynamic {
	
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone",Keys.ENTER);
	
	WebElement dynamic = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Starlight, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_25b18c']"));
	
	String price = dynamic.getText();
	System.out.println(price);
		
	}

}
