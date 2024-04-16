package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
	
		    WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("http://127.0.0.1/login.jsp");
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			
			driver.findElement(By.xpath("//a[@class='content users']")).click();
			
			driver.findElement(By.xpath("//input[@value='Create New User']")).click();
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test Engg");
			
			driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("kat");
		
			driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("kat");
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Katherine");
			
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Langford");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			

			String createdUser = "Katherine";
			//driver.findElement(By.xpath("//a[@class='content users']")).click();
			List<WebElement> users = driver.findElements(By.xpath("//td[@nowrap='1']"));
			
			for (WebElement user : users) {
				String name = user.getText();
				System.out.println(name);
				if (name.contains(createdUser)) {
					user.click();
					driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
					Alert alt = driver.switchTo().alert();
					alt.accept();
				}
			}
			
		
	}

}
