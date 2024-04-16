package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

// Taking screenshot of particular webElement

public class ParticularWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		// Click on Gold Coin button
		driver.findElement(By.xpath("//a[@title='Coins']")).click();
		
		WebElement coin = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
		
		// Scroll till particular webElement
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", coin);
		
		// Taking screenshot 
		File src=coin.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/goldcoin.png");
		Files.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
