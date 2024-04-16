package Window_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fullscreen {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		
	}


}
