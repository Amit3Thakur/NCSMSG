package stepdepen.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Message {

	static WebDriver driver;
	public Message(WebDriver driver) {
		 this.driver = driver;
	}


	public static void Message() throws InterruptedException {
	         

		WebElement  MasterData  = driver.findElement(By.xpath("(//a[@id='navbarDropdown'])"));
		MasterData.click();
		Thread.sleep(2000);
		
		WebElement Message  = driver.findElement(By.xpath("(//a[@href='#/message'])"));
		Message .click();   
		
		WebElement  Add  = driver.findElement(By.xpath("(//button[@data-target='#editModal'])"));
		Add.click();
		Thread.sleep(2000);
		
		WebElement  subject = driver.findElement(By.xpath("(//input[@name='subject'])[2]"));
		subject.sendKeys("Testing NCS");
		Thread.sleep(2000);
	
		Select HTML = new Select(driver.findElement(By.xpath("(//select[@name='html'])[2]")));
		HTML.selectByValue("Y");
		
		WebElement  TemplateCode  = driver.findElement(By.xpath("(//input[@name='templateCode'])[2]"));
		TemplateCode.sendKeys("NCSstechhsoft");
		Thread.sleep(2000);
		
		Select Type = new Select(driver.findElement(By.xpath("(//select[@name='type'])[2]")));
		Type.selectByValue("Email");
	
		Select Status = new Select(driver.findElement(By.xpath("(//select[@name='status'])[2]")));
		Status.selectByValue("Active");
	
		WebElement  MessageBody  = driver.findElement(By.xpath("(//textarea[@name='body'])"));
		MessageBody.sendKeys("Automation testing");
		Thread.sleep(2000);
		
		WebElement   Save1  = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		 Save1.click();
		Thread.sleep(2000);
		
		
     	WebElement   Close1  = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
		Close1.click();
		Thread.sleep(2000);
	
        WebElement   Edit  = driver.findElement(By.xpath("((//button[@title='Edit'])[1])"));
		Edit.click();
		Thread.sleep(2000);
	
		WebElement element = driver.findElement(By.xpath("(//input[@name='subject'])[2]"));
		element.clear();  
		Thread.sleep(2000);
	
		WebElement  subject1 = driver.findElement(By.xpath("(//input[@name='subject'])[2]"));
		subject1.sendKeys("TestNCS");
		Thread.sleep(2000);
		
		Select HTML1 = new Select(driver.findElement(By.xpath("(//select[@name='html'])[2]")));
		HTML1.selectByValue("Y");
		
		
		WebElement element2 = driver.findElement(By.xpath("(//input[@name='templateCode'])[2]"));
		element2.clear();  
		Thread.sleep(2000);
		
		WebElement  TemplateCode1  = driver.findElement(By.xpath("(//input[@name='templateCode'])[2]"));
		TemplateCode1.sendKeys("NCSM");
		Thread.sleep(2000);
		
		
		Select Type1 = new Select(driver.findElement(By.xpath("(//select[@name='type'])[2]")));
		Type1.selectByValue("Email");
	
	    Select Status1 = new Select(driver.findElement(By.xpath("(//select[@name='status'])[2]")));
		Status1.selectByValue("Active");
	
		WebElement element4 = driver.findElement(By.xpath("(//textarea[@name='body'])"));
		element4.clear();  
		Thread.sleep(2000);
		
		WebElement  MessageBody1  = driver.findElement(By.xpath("(//textarea[@name='body'])"));
		MessageBody1.sendKeys("NCS Automation testing");
		Thread.sleep(2000);
		
		WebElement   Save2  = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		 Save2.click();
		Thread.sleep(2000);
		
		
   	WebElement   Close2  = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
		Close2.click();
		Thread.sleep(2000);
	
	
		WebElement Info = driver.findElement(By.xpath("(//button[@title='Info'])[1]"));
		Info.click();
		Thread.sleep(2000);                      
		
		
    	WebElement   Close3  = driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]"));
		Close3.click();
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
			
			WebElement subject2 = driver.findElement(By.xpath("(//input[@id='subject'])"));	
			subject2.sendKeys("01test");
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='marginSet']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
			Thread.sleep(2000);
			
			WebElement Body = driver.findElement(By.xpath("(//input[@id='body'])[1]"));	
			Body.sendKeys("testing is going on	");
			Thread.sleep(2000);
			
        driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
        Thread.sleep(2000);
			
		  driver.findElement(By.xpath("//button[@id='marginSet']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
		 Thread.sleep(2000);
		 
		 Select Status2 = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
		 Status2.selectByValue("Active");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
		 Thread.sleep(2000);
	
	
		 driver.findElement(By.xpath("//button[@id='marginSet']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
		 Thread.sleep(2000);
	

			WebElement Key = driver.findElement(By.xpath("(//input[@id='skey'])[1]"));	
			Key.sendKeys("1671197399417");
			Thread.sleep(2000);
			
     driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
     Thread.sleep(2000);
			
		  driver.findElement(By.xpath("//button[@id='marginSet']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();
		 Thread.sleep(2000);
		 
		 
	}
	
}
