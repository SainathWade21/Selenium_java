package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Booking Flight from AirVistara

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Pune");

		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();


		driver.findElement(By.xpath("//div[@id='travel-Dates']/descendant::input[@name='depart']")).click();
		
		driver.findElement(By.xpath("//a[@data-date='20']")).click();
		
		driver.findElement(By.xpath("//a[@data-date='30']")).click();
		
		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		
		driver.findElement(By.xpath("//button[@id='adds_adult']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'done_btn')]")).click();
		
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();

	}

}
