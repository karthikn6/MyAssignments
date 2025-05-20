package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Leads"));
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KarthiknTest");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthikn");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhanabalan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestCompany");
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(3000);
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		driver.close();
		
	}

}
