package stepdepen.java;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdependefintions {
	
	WebDriver driver;
	login Login;
	Masterdata masterdata;
	Message message;
	Sendmessage email;
	Report report;
	
	
	@BeforeTest
	public void startup () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Login=new login(driver);
		 masterdata = new Masterdata(driver);
		 message = new Message(driver);
		 email =  new Sendmessage (driver);
		 report = new Report(driver);
	 }
	
	@Test(priority = 0)
	public void LoginFunctionality() throws InterruptedException {
		login.login();
	 }
		 
		@Test(priority = 1)
		public void masterdataFunctionality() throws InterruptedException {
			Masterdata.Masterdata();
		 }
		
		@Test(priority = 2)
		public void messagedataFunctionality() throws InterruptedException {
			Message.Message();
	}
		
		
		@Test(priority = 3)
		public void emaildataFunctionality() throws InterruptedException {
			Sendmessage.Sendmessage();
	}
		
		@Test(priority = 4)
		public void reportFunctionality() throws InterruptedException, AWTException {
			Report.Report();
		 }
		
}

