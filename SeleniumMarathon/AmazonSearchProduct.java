package SeleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchProduct {

	public static void main(String[] args) {
//Login amazon site
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Search for product Bags	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Get the search result and product count
		String result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println("Result for search bags: "+result);
		
		//Click on Safari brand
		driver.findElement(By.xpath("//span[text()='Brands']/following::span[text()='Safari']")).click();
		//click on New arrivals
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		// select Gear brand
		driver.findElement(By.xpath("//span[text()='Gear']")).click();
		
		//Get the 1st product details
		String details = driver.findElement(By.xpath("//span[text()='Verge 37L Casual Printed Backpack, 3 Compartments, Raincover, Armor Base, Organizer, Bottle Holder, Front Pocket, School Bag for Boys and Girls, College Bag, Office Bag, Travel Bag']")).getText();
		System.out.println("1st product details: " +details);
		
		String title = driver.getTitle();
		System.out.println("Page title is: "+title);
				
		driver.close();
		

	}

}
