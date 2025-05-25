package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		if(title.contains("Dashboard")) {
			System.out.println("Title is printed");
		} else {
			System.out.println("Title is not printed");
	}
		driver.navigate().back();
		boolean enabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']/span")).isEnabled();
	    System.out.println("Confirm if the button is disabled: "+enabled);
		
		 WebElement button = driver.findElement(By.xpath("//span[text()='Submit']"));
		 Point position = button.getLocation();
		 System.out.println("Find the position of the Submit button: "+position);
		
		 WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
		 String color = saveButton.getCssValue("color");
		 System.out.println("Save button color: "+color);
		 
		 WebElement heightButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
		 Dimension height = heightButton.getSize();
		 System.out.println("Height and width of this button: "+height);
		 		 
		 driver.close();
	}

}
