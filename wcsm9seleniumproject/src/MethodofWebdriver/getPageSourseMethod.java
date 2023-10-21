package MethodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			
			
			Thread.sleep(2000);
			String titleofpage= driver.getTitle();
			
			driver.close();

	}

}
