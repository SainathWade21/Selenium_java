package Window_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	Dimension size = driver.manage().window().getSize();
	
	System.out.println(size);
	
		driver.get("https://www.google.com/");
	}
	
}
