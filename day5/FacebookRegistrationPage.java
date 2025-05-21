package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Karthikeyan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhanabalan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password123");
		
		WebElement dd1 = driver.findElement(By.name("birthday_day"));
		Select opt1 = new Select(dd1);
		opt1.selectByVisibleText("6");
		
		WebElement dd2 = driver.findElement(By.name("birthday_month"));
		Select opt2 = new Select(dd2);
		opt2.selectByVisibleText("Dec");
		
		WebElement dd3 = driver.findElement(By.name("birthday_year"));
		Select opt3 = new Select(dd3);
		opt3.selectByVisibleText("1987");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
	}

}
