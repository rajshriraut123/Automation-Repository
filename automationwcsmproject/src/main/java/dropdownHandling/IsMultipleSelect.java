package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleSelect {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/link");
		
		driver.findElement(By.linkText("Dropdown")).click();
		
		//single select Dropdown
		dropdown dropdown1= driver.findElement(By.xpath("//label[text()]"));
		
		Select sel= new Select(dropdown1);
		
		boolean status =sel.isMultiple();
		System.out.println(status);
		

	}

}
