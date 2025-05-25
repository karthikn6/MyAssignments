package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeadLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1231231230");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='CMPFirstName']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1231231230");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(3000);
	    
		WebElement noRecords = driver.findElement(By.xpath("//div[text()='No records to display']"));
		if(noRecords.isDisplayed());
		{ System.out.println("Searching records are not displaying");
		}
		
		driver.close();
	}

}
