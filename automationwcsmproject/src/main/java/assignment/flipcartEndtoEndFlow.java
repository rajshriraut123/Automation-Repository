package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartEndtoEndFlow {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("IPHONE13");
		driver.findElement(By.xpath("//button[contains(@title,'Search for')]")).click();
		
		String parentHandle = driver.getWindowHandle();
		//driver.findElement(By.xpath("
		
		
		
		
		
		

	}

}
