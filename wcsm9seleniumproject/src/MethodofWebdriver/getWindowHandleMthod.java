package MethodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMthod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			
			
		// take the adress of current window or browser
			//parent browser-----(the browser or window has controls)
			String parentHandle= driver.getWindowHandle();
			
			System.out.println(parentHandle);
	}

}
