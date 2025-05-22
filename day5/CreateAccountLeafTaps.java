package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountLeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("KarthiknTestAcc1");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		WebElement dd1 = driver.findElement(By.name("industryEnumId"));
		Select opt1 = new Select(dd1);
		opt1.selectByContainsVisibleText("Computer Software");
		
		WebElement dd2 = driver.findElement(By.name("dataSourceId"));
		Select opt2 = new Select(dd2);
		opt2.selectByContainsVisibleText("S-Corporation");
		
		WebElement dd3 = driver.findElement(By.name("industryEnumId"));
		Select opt3 = new Select(dd3);
		opt3.selectByContainsVisibleText("Employee");
		
		WebElement dd4 = driver.findElement(By.name("marketingCampaignId"));
		Select opt4 = new Select(dd4);
		opt4.selectByIndex(6);
		
		WebElement dd5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt5 = new Select(dd5);
		opt5.selectByValue("TX");
		
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Create Account | opentaps CRM")) {
			System.out.println("Title is matched"); 
		}
			else {
				System.out.println("Title is mismatched");
			}
		driver.close();
		}
	}
