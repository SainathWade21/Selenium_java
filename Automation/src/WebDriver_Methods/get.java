package WebDriver_Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.airvistara.com/");
		
		String actual=driver.getTitle();
		String expected="Book Flights & Check In Online | Vistara";
	
		if(actual.equals(expected))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
	}

}
