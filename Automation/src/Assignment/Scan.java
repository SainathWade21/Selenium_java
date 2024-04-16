package Assignment;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String a=sc.next();
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www."+a);
		System.out.println("Here you got it🤣🤣🤣");

	}

}
