package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class eliminateDuplicate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/3.single%20Select%20static%20Element.html");
		
		WebElement menuDropDown =driver.findElement(By.id("addd"));
		
		
		//get all the options of dropdown 
		
		Select sel= new Select(menuDropDown);
		List<WebElement> allops = sel.getOptions();
		
	//to e;eminate duplicate we use hashset
		HashSet<String> hs= new  HashSet<String>();
		
		//read the list by using for loop
		
		for(int i=0;i<allops.size();i++)
	{
			WebElement op= allops.get(i);
			
		//get the text of webelement
			String dropDownOption= op.getText();
			//add the dropdownoption into hashset and remove duplicate
			hs.add(dropDownOption);
			Thread.sleep(2000);
			
	}
		
		
		
		//read the options from hashset by using for each loop
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
			
		}
	}

}
