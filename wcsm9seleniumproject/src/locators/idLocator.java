package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MethodofWebdriver.closeMethod;

public class idLocator {

	
		public static void main(String[] args) throws InterruptedException 
		{
			// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	     //launch the self design webpage
		driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/7.mini%20page.html");
		Thread.sleep(2000);
		
		//for Username text box using id
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		
		//for password text box using id
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.close();
	
		
	}

}
