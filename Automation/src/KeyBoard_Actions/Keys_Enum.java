package KeyBoard_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Enum {						
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://desktop-imrp9k5/login.do");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	
			// We can use Keys_Enum inside sendKeys only
	}

}
