package stepdepen.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {

	static WebDriver driver;
		 
		 public login(WebDriver driver) {
			 this.driver = driver;
		 }
		
		public static void login() throws InterruptedException {
			
			driver.get("http://85.25.93.180:8080/NCSMSG/#/login");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@href='#/signup']")).click();
			Thread.sleep(1000);
			
			WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
			firstName.sendKeys("Amit"); 
			Thread.sleep(1000);
			
			WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
			lastName.sendKeys("NCS"); 
			Thread.sleep(1000);
			
			WebElement  LoginId  = driver.findElement(By.xpath("//input[@id='login']"));
			LoginId.sendKeys("amitt.ncs@nenosystem.in"); 
			Thread.sleep(1000);
		
	       WebElement Password  = driver.findElement(By.xpath("//input[@id='password']"));
	       Password.sendKeys("pass12345");
		   Thread.sleep(1000);
				
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(1000);        
	
         driver.findElement(By.xpath("//a[@href='#/login']")).click();
         Thread.sleep(1000);
         
			WebElement LoginId1 = driver.findElement(By.xpath("//input[@id='loginid']"));
			LoginId1.sendKeys("vivekanand.deshmukh@nenosystems.in");
			Thread.sleep(1000);
			
			WebElement  Password1 = driver.findElement(By.xpath("//input[@id='password']"));
			Password1.sendKeys("pass1234");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
		
		}

}
