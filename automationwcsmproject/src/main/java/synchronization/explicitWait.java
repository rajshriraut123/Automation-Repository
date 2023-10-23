package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =new ChromeDriver(); 
	driver.manage().window().maximize();

	
	driver.get("https://www.shoppersstack.com/");
	
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")));
	
	//driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
	
	driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	
	
	
	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Che")));
	
	ele.click();

	}
	
	
	public static WebElement explicitWait(WebDriver driver, long sec, WebElement ele)
	
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
		
	} 

}
