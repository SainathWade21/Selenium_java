package Mouse_Actions_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class perform {
	
	// perform() is the Compulsory method which has to be use with every Action method
	// Without this method we can't perform any mouse action
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		//create the object of Actions class
		Actions act = new Actions(driver);
		
		//use clickAndHold()
		act.clickAndHold(driver.findElement(By.id("circle"))).perform();
		
	}




}
