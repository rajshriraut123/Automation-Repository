package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class tagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
     //launch the self design webpage
	driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/7.mini%20page.html");
	
	//for Username text box using tagname
	driver.findElement(By.tagName("input")).sendKeys("admin");
	Thread.sleep(2000);
	
	//for Password Textbox using tagname
	driver.findElement(By.tagName("input")).sendKeys("manager");
	Thread.sleep(2000);
	
	driver.close();
	}

}
