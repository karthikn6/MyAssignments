package week4.day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleSalesforce {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");

		//Login salesforce and click Learnmore button
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.xpath("//label[@class='label']/following-sibling::input")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//div[@id='pwcaps']/following-sibling::input")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[2]")).click();
		Thread.sleep(3000);	
		
		//Get all windows	
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All windows: "+allWindows);
		
		//Convert set to List for get list of window 
		List<String> getWidnow = new ArrayList<String>(allWindows);
		driver.switchTo().window(getWidnow.get(1));
		Thread.sleep(3000);
		
		//Get title of child window and close
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String childWindow = driver.getTitle();
		System.out.println("Child window title: "+childWindow);
		Thread.sleep(3000);
		driver.close();
		 
		//Get title of parent window
		driver.switchTo().window(getWidnow.get(0));
		String parentdWindow = driver.getTitle();
		System.out.println("Parent window title: "+parentdWindow);
		
		driver.quit();
	}

}
