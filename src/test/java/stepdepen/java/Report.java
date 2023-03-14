package stepdepen.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Report {

	static WebDriver driver;

	public Report(WebDriver driver) {
		this.driver = driver;
	}

	public static void Report() throws InterruptedException, AWTException {
		
		WebElement  MasterData  = driver.findElement(By.xpath("(//a[@id='navbarDropdownMenuLink'])[2]"));
		MasterData.click();
		Thread.sleep(2000);
		
		WebElement MyProfile = driver.findElement(By.xpath("//a[@href='#/myprofile']"));
		MyProfile.click();
		Thread.sleep(1000);
		
	   WebElement button=driver.findElement(By.xpath("(//img[@class='rounded'])[3]"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();",button);
	    		
	  Robot rb=new Robot();
	  rb.delay(3000);
	  
	  StringSelection ss=new StringSelection("C:\\Users\\ncs\\Downloads\\Test");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(3000);

	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	rb.delay(3000);
   
    WebElement Update =driver.findElement(By.xpath("//button[@ng-click='updateProfileImage(form.data.id)']"));
    Update.click();
    rb.delay(2000); 
    

	}

	
}
