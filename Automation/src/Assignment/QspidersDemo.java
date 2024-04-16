package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		if(name.isEnabled())
		{
			System.out.println("name is enabled");
		}
		else
		{
			System.out.println("name is disabled");
		}
		if(email.isEnabled())
		{
			System.out.println("email is enabled");
		}
		else
		{
			System.out.println("email is disabled");
		}
		if(password.isEnabled())
		{
			System.out.println("password is enabled");
		}
		else
		{
			System.out.println("password is disabled");
		}
		
		
	}

}
