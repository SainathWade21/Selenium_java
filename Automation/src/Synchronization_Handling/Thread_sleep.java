package Synchronization_Handling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Testing dropdown of Qspiders demo app

public class Thread_sleep {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white  text-sm  focus:outline-none w-full ease-linear transition-all duration-150']")).sendKeys("0984731234");
		Thread.sleep(3000);
		
		driver.findElement(By.id("select2")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("option11")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("select3")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("countryOpt6")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("select5")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("StateOpt22")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("CityOpt20")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("select7")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("optionquantity2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("continuebtn")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("(//p[@class='font-bold'])[2]")).getText();
		System.out.println("Total :"+price);
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
