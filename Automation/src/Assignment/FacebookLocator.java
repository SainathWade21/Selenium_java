package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Facebook Login

public class FacebookLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("9876543210");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("abcdef");
		WebElement button=driver.findElement(By.name("login"));
		button.click();	
	}

}
