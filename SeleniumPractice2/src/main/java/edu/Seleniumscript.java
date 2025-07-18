package edu;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Seleniumscript {
	public static void main(String args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.edureka.co");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

