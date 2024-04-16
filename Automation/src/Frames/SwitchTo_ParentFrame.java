package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ParentFrame {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		// Switch the control into frame by using index
		driver.switchTo().frame(0);
		
		
		// Pass mobile no here
		driver.findElement(By.id("regEmail")).sendKeys("9874563210");
		
		// Switch to Parent Frame
		driver.switchTo().parentFrame();
		
		// Click on Hamburger
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
		
	}





}
