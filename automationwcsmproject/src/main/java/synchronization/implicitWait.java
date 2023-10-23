package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class implicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));

	WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 //apply implicitWait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	 driver.get("https://www.shoppersstack.com/");
	 driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
	 driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
	
	} 

}
