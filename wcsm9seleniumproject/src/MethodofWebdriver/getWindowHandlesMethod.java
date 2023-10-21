package MethodofWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class getWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
	        driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
			
			String parentHandle=driver.getWindowHandle();
			System.out.println(parentHandle);
			
	
			driver.findElement(By.partialLinkText(parentHandle));
		//	Set<String> AallHandles= driver.getWindowHandles();
			// print adress of browser use for each loop
		//	for(String wh:allHandles)
			{
		//		if(!parentHandles.equal(wh))
		//		{
		//			System.out.println("adress of child window:"+wh);
				}
		//		else
				{
		//			System.out.println("adress of parent window:"+wh);
			
				}
			
			
	}
	}


