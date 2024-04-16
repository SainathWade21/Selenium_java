package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	//By using "arguments[0].scrollIntoView(false)"

public class ScrollTillElement2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/");
		
		// xpath of privacy
		WebElement privacy = driver.findElement(By.xpath("//p[text()='Privacy']"));
	   
		//Explicit TypeCasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",privacy);
	}





}
