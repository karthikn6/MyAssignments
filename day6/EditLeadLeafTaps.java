package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadLeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 //Login OpenTaps site
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/')]")).click();
	//Click and Lead tab and create new lead	
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CMP-Name");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("CMPFirstName");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("CMPLastName");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("CMPLocalName");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestDep");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Department field");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("1231231230");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
		 WebElement st = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt1 = new Select(st);
		opt1.selectByVisibleText("New York");
	//Submit create lead button	
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// Get above created lead in Lead tab 
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//button[@id='ext-gen422']")).click();
		driver.findElement(By.xpath("//a[text()='CMP-Name']")).click();
		//Edit lead and clear description and add notes
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Test Important Note field");
		// Update the saved lead
		driver.findElement(By.xpath("//td[@id='ext-gen529']")).click();
		//Get teh title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		driver.close();
	}

}
