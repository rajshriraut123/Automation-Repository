package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lauchFlipcart {

	public static void main(String[] args) {
		
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://www.flipkart.com/");
     
     driver.findElement(By.className("zlQd20 _1eDlvI")).click();
     
	}

}
