package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/5.RadioButtonElement.html");
		Thread.sleep(2000);
		
		//identify D radio button by using name locator
		driver.findElement(By.name("name4")).click();		


		//identify A radio button by using name locator
		driver.findElement(By.name("name1")).click();
		
		driver.close();

	}

}
