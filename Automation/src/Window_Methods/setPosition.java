package Window_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Point point = new Point(250,250);
		
		driver.manage().window().setPosition(point);
		
		driver.get("https://www.google.com/");
	}

}
