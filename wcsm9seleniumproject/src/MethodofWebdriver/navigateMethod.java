package MethodofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Launch the web application by using navigate();
		 
		 Navigation nav=driver.navigate();
		  nav.to("https://www.selenium.dev/downloads/");
		 Thread.sleep(2000);
		 
		 nav.back();
		 Thread.sleep(4000);
		 
		 //to perform forward operation
		 nav.forward();
		 Thread.sleep(2000);
		 
		//to perform refresh operation
		 nav.refresh();
		 Thread.sleep(2000);
		 
	}

}
