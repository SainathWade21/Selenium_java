package PopupHandling_WindowBased;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_SendKeys {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(3000);
		
		// Uploading file using sendKeys()
		// We can upload file using sendKeys() only if there is type='file' attribute present
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Administrator\\Documents\\ab.txt");
		
	}

}
