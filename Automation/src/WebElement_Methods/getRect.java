package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	
	//xpath of Login Button	
		WebElement button=driver.findElement(By.xpath("//button[@value='1']"));
		
		Rectangle rect = button.getRect();
		
		int height=rect.getHeight();			//Fetching & storing the height of Login button	
		System.out.println("Height: "+height);

		int width=rect.getHeight();				//Fetching & storing the width of Login button
		System.out.println("Width: "+width);
				
		System.out.println("X: "+rect.getX());	//Directly Fetching & Printing the X_co-ordinate of Login button
		
		System.out.println("Y: "+rect.getY());	//Directly Fetching & Printing the Y_co-ordinate of Login button	
		
		Thread.sleep(3000);
		driver.close();
	
	}

}
