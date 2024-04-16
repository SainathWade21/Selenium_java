package DataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLogin {
	public static void main(String[] args) throws IOException {
		
		Facebook details = new Facebook();
		WebDriver driver = details.LaunchBrowser("BROWSER");
		details.LaunchUrl("URL");

		String username = details.FacebookDetails("USERNAME");
		String password = details.FacebookDetails("PASSWORD");
		
		System.out.println(username);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
