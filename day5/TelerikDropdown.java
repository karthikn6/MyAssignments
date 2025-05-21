package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TelerikDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.telerik.com/contact");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dd = driver.findElement(By.name("DropdownListFieldController_0"));
		Select opt = new Select(dd);
		opt.selectByIndex(5);
		
		WebElement dd1 = driver.findElement(By.name("DropdownListFieldController"));
		Select opt2 = new Select(dd1);
		opt2.selectByVisibleText("UI for React");
		driver.findElement(By.id("Textbox-1")).sendKeys("Karthikn");
		driver.findElement(By.id("Textbox-2")).sendKeys("D");
		driver.findElement(By.id("Email-1")).sendKeys("test@test.com");
		driver.findElement(By.id("Textbox-3")).sendKeys("TestCompany");
		
		WebElement dd2 = driver.findElement(By.name("DynamicListFieldController"));
		Select opt3 = new Select(dd2);
		opt3.selectByVisibleText("France");
		
		driver.findElement(By.id("Textbox-4")).sendKeys("999666333");
		driver.findElement(By.id("Textarea-1")).sendKeys("test");
			
	}

}
