package MethodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			
			String urlofLoginPage= driver.getCurrentUrl();
			System.out.println(urlofLoginPage);
			Thread.sleep(2000);
			
			
	}

}
