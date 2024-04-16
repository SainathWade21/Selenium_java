package Window_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition {
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	Point position = driver.manage().window().getPosition();
	
	System.out.println(position);
	
	driver.get("https://www.google.com/");
	}
	

}
