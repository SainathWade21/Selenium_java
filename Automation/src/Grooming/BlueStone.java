package Grooming;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlueStone {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Gold Coin",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']")).click();
		
		Set<String> Windows = driver.getWindowHandles();
		
		// Switching the control to another window
		for(String window : Windows) {
			driver.switchTo().window(window);
			if (driver.getTitle().equals("1 gram 24 KT Gold Coin | BlueStone.com")) {
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement quantity = driver.findElement(By.xpath("//select[@class='qty']"));
		
		// Selecting quantity
		Select s1 = new Select(quantity);
		s1.selectByVisibleText("5");
		
		driver.findElement(By.xpath("//a[@title='Place Order']")).click();
		WebElement price = driver.findElement(By.xpath("//div[@class='summary-total grand-total row']"));
		System.out.println(price.getText());
		driver.quit();
	}
}
