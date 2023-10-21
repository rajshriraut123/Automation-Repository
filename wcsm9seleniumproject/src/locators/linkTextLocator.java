package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stubWebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
	     Thread.sleep(2000);
	    
	     //linkText Locator
	     driver.findElement(By.linkText("SeleniumTutorial")).click();
	     Thread.sleep(2000);
	     
	     driver.close();

	}

}
