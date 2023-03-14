package stepdepen.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sendmessage {

	static WebDriver driver;

	public Sendmessage(WebDriver driver) {
		this.driver = driver;
	}

	public static void Sendmessage() throws InterruptedException {

		WebElement MasterData = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		MasterData.click();
		Thread.sleep(1000);

		WebElement SendMessage = driver.findElement(By.xpath("(//a[@href='#/sendmessage'])"));
		SendMessage.click();
		Thread.sleep(1000);

		Select  FormEmail  = new Select(driver.findElement(By.xpath("//select[@id='emailProperty']")));
		FormEmail.selectByValue("1625483761677");
			
		WebElement To = driver.findElement(By.xpath("//input[@name='to']"));
		To.sendKeys("amit.thakur@nenosystems.in");
		Thread.sleep(1000);
		
		WebElement   Subject   = driver.findElement(By.xpath("//input[@id='subject']"));
		Subject.sendKeys("Test");
		Thread.sleep(1000);
		
		WebElement  Message  = driver.findElement(By.xpath("//textarea[@name='body']"));
		Message.sendKeys("Test");
		Thread.sleep(1000);
		
		WebElement submit  = driver.findElement(By.xpath("(//button[@type='submit'])"));
		submit.click();  
		

		driver.get("https://mail.nenosystems.in/?loginOp=logout");
		Thread.sleep(1000);

		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("amit.thakur@nenosystems.in");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Amit@2022");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
	}

}
