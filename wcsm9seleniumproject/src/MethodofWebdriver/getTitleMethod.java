package MethodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		String titleofpage= driver.getTitle();
		
		System.out.println(titleofpage);
		System.out.println(driver.getTitle());
	}

}
