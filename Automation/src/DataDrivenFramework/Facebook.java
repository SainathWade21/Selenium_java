package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	
	WebDriver driver;
	
	
	public String FacebookDetails(String Key) throws IOException
	{
		// Fetching the particular Property file
		FileInputStream a = new FileInputStream("./TestData/FacebookLogin.properties");
		Properties properties = new Properties();
		
		// Loading all the values which is present inside the file
		properties.load(a);
		
		// Accessing the particular value by passing key
		String Value = properties.getProperty(Key);
		
		return Value;	
	}
	
	
	public WebDriver LaunchBrowser(String Key) throws IOException
	{
		String Value = this.FacebookDetails(Key);
		
		if (Value.equals("chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		else if (Value.equals("edge")) {
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		else if (Value.equals("firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		return driver;
	}

	
	public void LaunchUrl(String Key) throws IOException {
		
		String Value = this.FacebookDetails(Key);
		
		driver.get(Value);
	}
}