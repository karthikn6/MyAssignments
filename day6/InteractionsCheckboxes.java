package week2.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/span")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
	    String alertMessage = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
	   if(alertMessage.equals("Checked")) {
		   System.out.println("Notification Alert message displayed: "+alertMessage);
	   } else {
		   System.out.println("Notification Alert Message is not displayed");
	   }
	   
	   driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	   driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
	   driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
	   
	   String toggleMessage = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getTagName();
	   if(toggleMessage.equals("Checked")) {
		   System.out.println("Toggle Alert message displayed: "+toggleMessage);
	   } else {
		   System.out.println("Toggle Alert message is not displayed");
	   }
	   
	   boolean checkboxEnabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
	   System.out.println("Verify if check box is disabled: "+checkboxEnabled);
	     
	   driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	   driver.findElement(By.xpath("//input[@id='j_idt87:multiple:2']")).click();
	   driver.findElement(By.xpath("//input[@id='j_idt87:multiple:4']")).click();
	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	   
	   driver.close();
	}}