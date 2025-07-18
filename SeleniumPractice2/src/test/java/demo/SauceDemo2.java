package demo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemo2 {
	public String baseUrl = "https://www.saucedemo.com/";
	public WebDriver driver ; 
	

	
		@BeforeTest
		public void setup()
		{
			System.out.println("Before Test executed");
			// TODO Auto-generated method stub
			driver=new ChromeDriver();

			//maximise windows
			driver.manage().window().maximize();

			//open url
			driver.get(baseUrl);

			//timer i kept as 60 you can keep 40
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); //60 seconds
			
		}
}
