package SeleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
				driver.get("https://www.pvrcinemas.com/");
				driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
				driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
				Thread.sleep(3000);
            			
                driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
				driver.findElement(By.xpath("(//span[text()='TOURIST FAMILY'])[2]")).click();
				
				driver.findElement(By.xpath("(//span[contains(@class,'p-dropdown-label')])[3")).click();
				driver.findElement(By.xpath("(//ul[contains(@class,'p-dropdown-items')]/li)[2]")).click();
				
				driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[4]")).click();
				driver.findElement(By.xpath("//span[text()='PVR Heritage RSL ECR Chennai']")).click();
				
				driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[5]")).click();
				driver.findElement(By.xpath("//span[text()='09:10 AM']")).click();
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);
				
                driver.findElement(By.xpath("//button[text()='Accept']")).click();
                driver.findElement(By.xpath("//span[@id='PE.PRIME|B:6']")).click();
                driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
                
                String seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
                System.out.println("Seat Info: "+seatInfo);
                
                String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
                System.out.println("Grand total: "+grandTotal);
                
                driver.findElement(By.xpath("//button[text()='Continue']")).click();
                driver.findElement(By.xpath("//i[@class='pi pi-times']")).click();
                
                String title = driver.getTitle();
                System.out.println("Page Title is: "+title);
                
               driver.close();
	}

}
