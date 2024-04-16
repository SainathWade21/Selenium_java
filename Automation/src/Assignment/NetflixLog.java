package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Netflix login

public class NetflixLog {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/login");
		
		WebElement element=driver.findElement(By.id("id_userLoginId"));
		
		element.sendKeys("9632587410");
		
        WebElement pass =driver.findElement(By.name("password"));
		
		pass.sendKeys("abcde");
		
		WebElement button =driver.findElement(By.className("login-button"));
		
		button.click();
		
	}

}
