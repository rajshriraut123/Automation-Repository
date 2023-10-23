package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspiderApplication {

	public static void main(String[] args) {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));

		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //apply implicitWait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		 driver.get("https://www.shoppersstack.com/");
	}

}
