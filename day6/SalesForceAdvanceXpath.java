package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceAdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.xpath("//label[@class='label']/following-sibling::input")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//div[@id='pwcaps']/following-sibling::input")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
