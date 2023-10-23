package methodOfWebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethodforEachLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		//identify all the the suggestions of bike
		List<WebElement> bikeOptions =driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		//read all the suggestion of the bike by using for loop
		Thread.sleep(2000);
		
		 //For each loop
		 for(WebElement op: bikeOptions) {
			 String Options=op.getText();
			 Thread.sleep(2000);
			 System.out.println(Options);
			  
		 }
		}

	}


