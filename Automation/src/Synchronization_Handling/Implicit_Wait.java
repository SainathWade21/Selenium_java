package Synchronization_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	/*	Implicit wait is Global wait because we need to declare it only once 
		and it will applicable for all the findElement & findElements	
	*/	
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group']")).click();
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		driver.findElement(By.xpath("//input[@class='px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white  text-sm  focus:outline-none w-full ease-linear transition-all duration-150']")).sendKeys("0984731234");
		
		driver.findElement(By.id("select2")).click();
		
		driver.findElement(By.id("option11")).click();
		
		driver.findElement(By.id("select3")).click();
		
		driver.findElement(By.id("countryOpt6")).click();
		
		driver.findElement(By.id("select5")).click();
		
		driver.findElement(By.id("StateOpt22")).click();
		
		driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]")).click();
		
		driver.findElement(By.id("CityOpt20")).click();
		
		driver.findElement(By.id("select7")).click();
		
		driver.findElement(By.id("optionquantity2")).click();
		
		driver.findElement(By.id("continuebtn")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//section[contains(@class,'pt-8')]/descendant::p[@class='font-bold'][2]")).getText();
		System.out.println("Total :"+price);
		
		Thread.sleep(2000);
		driver.close();
}

}
