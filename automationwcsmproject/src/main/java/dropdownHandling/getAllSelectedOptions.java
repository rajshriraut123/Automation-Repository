package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.build.Plugin.NoOp;

public class getAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/admin/Desktop/SeleniumWorkspace/html%20code/3.1Multiple%20select%20Dynamic%20Element.html");
		
	//multiselct dropdown
		
		WebElement menudropdown = driver.findElement(By.id("addd"));
		Select sel =new Select(menudropdown);
		
		for(int i=0;i<4;i++);
		{
		Thread.sleep(2000);
		int i = 0;
		sel.selectByIndex(i);
		}
		
		 //read only Selected optionsfrom menu dropdown
		
		List<WebElement> allOpts =sel.getAllSelectedOptions();
		
		//read the list by using for loop
		
		//for(int i=0;i>allOpts.size();i++);
		
		//String opt1=op.getText();
		//Thread.sleep(2000);
		//System.out.println(opt1);
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
