package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonLeafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		boolean selected = driver.findElement(By.xpath("//label[text()='Chrome']")).isSelected();
		System.out.println("Radio button is already selected: " +selected);
		
		boolean selected1 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println("21-40 Years Radio button is selected: " +selected1);
		
		boolean enabled1 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isEnabled();
		System.out.println("21-40 Years Radio button is selected defaultly: " +enabled1);
		boolean enabled2 = driver.findElement(By.xpath("//label[text()='Safari']")).isEnabled();
		System.out.println("Safari is selected defaultly: " +enabled2);
		
		driver.close();

	}
}
