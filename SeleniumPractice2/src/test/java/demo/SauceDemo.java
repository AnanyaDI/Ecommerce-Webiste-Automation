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

public class SauceDemo {
	public String baseUrl = "https://www.randbfashion.in/";
	public WebDriver driver ; 
	

	
		@BeforeTest
		public void setup()
		{
			System.out.println("Before Test executed");
			//  Auto-generated method stub
			driver=new ChromeDriver();

			//maximise windows
			driver.manage().window().maximize();

			//open url
			driver.get(baseUrl);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); //60 seconds
		}
		@Test
		
		public void loginTestWithValidCredential() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[@class='hidden-md-down desktop customShowcaseNew l']//img[@alt='user-icon']")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//input[@id='login-form-email']")).sendKeys("ananyainamadar4567@gmail.com");
			
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("ananyA_113456");
			Thread.sleep(500);
			
		
			driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
			Thread.sleep(500);
			
			
			
			
		    driver.findElement(By.xpath("//div[@class='search hidden-xs-down']//input[@placeholder='Search for clothes, accessories, footwear']")).sendKeys("Women Ethnic Printed Dresses");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//span[@id='product-0']//span[contains(@class,'name search-sug-name')][contains(text(),'Women Ethnic')]")).click();
			Thread.sleep(500);
			
			
			driver.findElement(By.xpath("//button[@id='size-1']")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//span[contains(@class,'add-to-cart-line')][normalize-space()='Add to Bag'])[2]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[@class='minicart']//div[@class='minicart-total hide-link-med desktop']//a[@title='Cart 0 Items']//*[name()='svg']")).click();
			Thread.sleep(500);
			
			
			driver.findElement(By.xpath("//div[contains(@class,'hidden-md-down')]//span[contains(@aria-hidden,'true')][normalize-space()='Remove']")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[contains(@class,'container cart cart-page')]//button[contains(@type,'button')][normalize-space()='Yes']")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[@class='hidden-md-down desktop customShowcaseNew l']//span[@class='user-message btn dropdown-toggle user-message-toggle user-msg-name'][normalize-space()='Ananya DI']")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//div[@class='hidden-md-down desktop customShowcaseNew l']//a[@role='menuitem'][normalize-space()='Logout']")).click();
			Thread.sleep(500);
			
			
			driver.findElement(By.xpath("//div[@class='hidden-md-down desktop customShowcaseNew l']//img[@alt='user-icon']")).click();
			Thread.sleep(500);
			
            driver.findElement(By.xpath("//input[@id='login-form-email']")).sendKeys("ananyainamadar4567@gmail.com");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("ananya");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
			Thread.sleep(500);

			
			
			
			
			
			
			
		}

			
			
		
			
			
		
		
		
		@AfterTest
		public void tearDown() throws InterruptedException
		{

			//	logOut();

			Thread.sleep(10000);//wait for 5 secs before quit
			driver.close();
			driver.quit();

		}
		
	}

