package Scanner_Class;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Location");
		String target = sc.next();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/maps");
		
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys(target,Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Directions']")).click();
		
		driver.findElement(By.xpath("//span[text()='Your location']")).click();
		
		WebElement a = driver.findElement(By.xpath("(//div[@class='Fk3sm fontHeadlineSmall delay-light'])[2]"));
		String time=a.getText();
		System.out.println("Time : "+time);
		
		WebElement b = driver.findElement(By.xpath("(//div[@class='ivN21e tUEI8e fontBodyMedium'])[2]"));
		String distance=b.getText();
		System.out.println("Distance : "+distance);
		
		Thread.sleep(3000);
		driver.quit();
		
	}



}
