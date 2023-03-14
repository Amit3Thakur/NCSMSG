package stepdepen.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Masterdata {

static WebDriver driver;
		 
		 public Masterdata(WebDriver driver) {
			 this.driver = driver;
		 }
		 public static void Masterdata() throws InterruptedException {
			 
		
			 
				WebElement  MasterData  = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
				MasterData.click();
				Thread.sleep(2000);

				WebElement Email  = driver.findElement(By.xpath("(//a[@href='#/emailproperty'])"));
				Email .click(); 
				Thread.sleep(2000);
				
				WebElement  Add  = driver.findElement(By.xpath("(//button[@data-target='#editModal'])[1]"));
				Add.click();
				Thread.sleep(2000);
				
				WebElement  Label = driver.findElement(By.xpath("(//input[@name='label'])[2]"));
				Label.sendKeys("Testing NCS");
				Thread.sleep(2000);
				
				Select status = new Select(driver.findElement(By.xpath("(//select[@id='status'])[2]")));
				status.selectByValue("Active");
				
				WebElement  UserId = driver.findElement(By.xpath("(//input[@name='userId'])[2]"));
				UserId.sendKeys("ncstesting@gmail.com");
				Thread.sleep(2000);
				
				WebElement  Password = driver.findElement(By.xpath("//input[@name='password']"));
				Password.sendKeys("ncs12345");
				Thread.sleep(2000);
				
				WebElement   Save  = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
				 Save.click();
				Thread.sleep(2000);
				
				
             	WebElement   Close  = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
				Close.click();
				Thread.sleep(2000);
				
				WebElement   Edit  = driver.findElement(By.xpath("(//button[@title='Edit'])[1]"));
				Edit.click();
				Thread.sleep(2000);
				
				WebElement element = driver.findElement(By.xpath("(//input[@name='label'])[2]"));
				element.clear();  
				Thread.sleep(2000);
			    
				WebElement  Label1 = driver.findElement(By.xpath("(//input[@name='label'])[2]"));
				Label1.sendKeys("auto msg NCS");
				Thread.sleep(2000);
				
				
				Select status1 = new Select(driver.findElement(By.xpath("(//select[@id='status'])[2]")));
				status1.selectByValue("Active");
				Thread.sleep(2000);

				WebElement element2 = driver.findElement(By.xpath("(//input[@name='userId'])[2]"));
				element2.clear();  
				Thread.sleep(2000);
				
				WebElement  UserId1 = driver.findElement(By.xpath("(//input[@name='userId'])[2]"));
				UserId1.sendKeys("Autotest@gmail.com");
				Thread.sleep(2000);
				
				WebElement element3 = driver.findElement(By.xpath("//input[@name='password']"));
				element3.clear();  
				Thread.sleep(2000);
				
				WebElement  Password1 = driver.findElement(By.xpath("//input[@name='password']"));
				Password1.sendKeys("pass45");
				Thread.sleep(2000);
				
				WebElement   Save1  = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
				 Save1.click();
				Thread.sleep(2000);
				
				
            	WebElement   Close1  = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
				Close1.click();
				Thread.sleep(2000);
				
				WebElement Info = driver.findElement(By.xpath("(//button[@title='Info'])[1]"));
				Info.click();
				Thread.sleep(2000);                      
				
				
            	WebElement   Close2  = driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
				Close2.click();
				Thread.sleep(2000);
				
             WebElement Enterlabel = driver.findElement(By.xpath("(//input[@type='text'])[1]"));	
			Enterlabel.sendKeys("Testing NCS");
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='marginSet']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
			Thread.sleep(2000);
			
//			
//			WebElement element4 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));	
//			element4.clear();  
//			Thread.sleep(1000);
			
			WebElement Key = driver.findElement(By.xpath("(//input[@id='skey'])"));	
			Key.sendKeys("1675347154244");
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='marginSet']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
			Thread.sleep(2000);
			
			WebElement UserID = driver.findElement(By.xpath("(//input[@id='userId'])[1]"));	
			UserID.sendKeys("ncstesting@gmail.com");
			Thread.sleep(2000);
			
           driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
           Thread.sleep(2000);
			
		  driver.findElement(By.xpath("//button[@id='marginSet']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
		 Thread.sleep(2000);
		 
		 Select Status = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
		 Status.selectByValue("Active");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
		 Thread.sleep(2000);
		
		 
		 
		 }
}
