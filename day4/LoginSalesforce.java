package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSalesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Remove unwanted popups in chrome 
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
	//Launch browser, hit the url and maximize window	
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	//Enter uname password and login	
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		Thread.sleep(3000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
	//Get the title of website	
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
