package methodsOfwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class sendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();//to lounch
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.netflix.com/in/login");//web application
	     WebElement usnTB = driver.findElement(By.name("userLoginId"));
	     usnTB.sendKeys("Admin");
	     
	  }
	}

	


