package PopupHandling_WebBased;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	// We can handle hidden division by inspecting it
public class HiddenDivisionPopup {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			
	// Opening Hidden Division Popup
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
	Thread.sleep(2000);
	
	// Handling Hidden division
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sainath");
	

	}	
}
