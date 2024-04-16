package Scanner_Class;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		while(true)
		{
			Scanner a=new Scanner(System.in);
			Scanner b=new Scanner(System.in);
			
			System.out.println("Enter Browser");
			String browser=a.next();
			String url=null;
	
			
			
			if (browser.equalsIgnoreCase("chrome")) 
			{
				System.out.println("Enter URL");
				url=b.next();
				driver=new ChromeDriver();
				driver.get("https://www."+url);
			}
			else if(browser.equalsIgnoreCase("firefox")) 
			{
				System.out.println("Enter URL");
				url=b.next();
				driver=new FirefoxDriver();
				driver.get("https://www."+url);
			}
			else if (browser.equalsIgnoreCase("edge")) 
			{
				System.out.println("Enter URL");
				url=b.next();
				driver=new EdgeDriver();
				driver.get("https://www."+url);
			}
			else
			{
				System.out.println("");
				System.out.println("__Invalid Browser__");
			//	System.out.println("Thanks for visit🤣🤣🤣");
				System.out.println("Plz enter valid Browser");
				System.out.println("");
			}
		//	System.out.println("");		
		//	System.out.println("Thanks for visit🤣🤣🤣");
			System.out.println("");
	  	}
	}

}
