package Dropdown_Handling_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Operational_getAllSelectedOptions {				
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
	//xPath of country multi_select_dropdown
		WebElement dropdown = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));	
		
		Select s1=new Select(dropdown);		//Select class is used to handle the dropdown
		s1.selectByIndex(4);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
				
		List<WebElement> selected = s1.getAllSelectedOptions();

		for(WebElement opt:selected)
		{
			System.out.println(opt.getText());
		}

	}

}
