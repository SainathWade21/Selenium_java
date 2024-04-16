
package TakesScreenshot;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way_4 {
public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.swiggy.com");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/img04.png");
		Files.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
	}


}
