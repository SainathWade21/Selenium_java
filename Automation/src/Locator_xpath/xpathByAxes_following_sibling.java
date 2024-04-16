package Locator_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAxes_following_sibling {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement sibling = driver.findElement(By.xpath("//div[@class='_1ch8e_']/following-sibling::div[@class='_1ch8e_']"));
		System.out.println(sibling.getText());

		}

}
