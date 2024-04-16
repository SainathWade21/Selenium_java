package Assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Registering on Naukari.com

public class NaukriLogin {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.className("nI-gNb-lg-rg__register")).click();
		
		driver.findElement(By.id("name")).sendKeys("sainath");

		driver.findElement(By.name("email")).sendKeys("akash@gamil.com");
		
		driver.findElement(By.id("password")).sendKeys("Pass@123");

        driver.findElement(By.id("mobile")).sendKeys("9874563210");
		
		driver.findElement(By.xpath("//div[@class='focusable optionWrap  '][2]")).click();
		
		driver.findElement(By.id("currentCity")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//span[@class='dd_bold']")).click();
		
        driver.findElement(By.xpath("//i[@class='ico-tick resman-icon resman-icon-check-box-checked']")).click();
		
		//driver.findElement(By.className("ddInput")).click();
		
		//driver.findElement(By.xpath("//span[@class='chk-label']")).click();
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
        
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
