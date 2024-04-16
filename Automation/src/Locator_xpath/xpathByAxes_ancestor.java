package Locator_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAxes_ancestor {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	
	WebElement list = driver.findElement(By.xpath("//span[@class='_1XjE3T']/ancestor::div[@class='_3sdu8W emupdz']"));
	System.out.println(list.getText());

	}
}
