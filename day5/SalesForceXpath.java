package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://login.salesforce.com/?locale=in");
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vidyar@testleaf.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sales@123");
driver.findElement(By.xpath("//input[@name='Login']")).click();

String title = driver.getTitle();
System.out.println(title);
driver.close();

	}

}
