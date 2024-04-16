package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("sainathwade384@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("Pass@123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();


	}

}
