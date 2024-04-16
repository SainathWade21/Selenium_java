package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER);
		
		driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();
	}

}
