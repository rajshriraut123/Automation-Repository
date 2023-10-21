package MethodofWebdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		 //handle properties of browser such as
		 //maximize
		 //minimize
		 //fullscreen
		 //setsize
		 //set position
		 
		 //maximize  the browser
		 driver.manage().window().maximize();
		// Thread.sleep(2000);
		 
		 //minimize  the browser
		 //driver.manage().window().minimize();
		 //Thread.sleep(2000);
		 
		 //fullScreen the browser
		 //driver.manage().window().fullScreen();
		 //Thread.sleep(2000);
		 
		// set the size of the browser
		// Dimension targetSize = new Dimension(350,400);
		// driver.manage().window().setSize(targetSize);
		// Thread.sleep(2000);
		 
		 Point targetPosition=new Point(450,250);
		 driver.manage().window().setPosition(targetPosition);
		 
	}

}
