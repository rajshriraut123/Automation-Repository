package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocator {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			driver.findElement(By.id("APjFqb")).sendKeys("joey tribbiani",Keys.ENTER);
			
			Thread.sleep(2000);
			
			//identify D radio button by using name locator
			driver.findElement(By.className("lNPNe")).click();	
			Thread.sleep(2000);


		
		//	driver.close();

		}

	}


