package org.ecom;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import maven1stproject.ExcelWrite;

public class Project1 extends ExcelWrite  {
	
	public static void main(String[] args) throws Throwable {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth Ramasamy\\Downloads\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rei.com/");
	driver.manage().window().maximize();
	
	WebElement click = driver.findElement(By.xpath("//span[@class='sign-in-txt']"));
	click.click();
	//typecasting
			TakesScreenshot tk = (TakesScreenshot)driver;
			//taking the screenshot in temp folder
			File temp = tk.getScreenshotAs(OutputType.FILE);
			System.out.println(temp);
			//Destination folder
			File desc = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\Rei\\Screenshot\\Screenshot1//gv.png");
			FileUtils.copyFile(temp, desc);
			
	
	
	WebElement usrName = driver.findElement(By.id("login-module-email"));
	
	usrName.sendKeys(getdata(1, 0));
	
	WebElement pass = driver.findElement(By.id("login-module-input-password"));
	
	pass.sendKeys(getdata(2, 0));
	
	
	
	WebElement search = driver.findElement(By.xpath("//input[@id='inputGroup']"));
	search.sendKeys("iphone");
	
	WebElement button = driver.findElement(By.xpath("//span[@class='icon icon-rei-search pull-left']"));
	button.click();
	Thread.sleep(2000);
	WebElement phone = driver.findElement(By.xpath("//div[contains(text(),'Apollo Plus Insulated Phone Pouch')]"));
	phone.click();
	Thread.sleep(2000);
	WebElement three = driver.findElement(By.xpath("//span[@id='js-product-cart-primary-text']"));
	three.click();
	Thread.sleep(2000);
	WebElement proceed = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	proceed.click();
	Thread.sleep(2000);
	WebElement msg = driver.findElement(By.xpath("//p[@class='h2 cart-total']"));
	String text = msg.getText();
	System.out.println(text);
	ExcelRead e = new ExcelRead();
	e.exRead(text);
	
	
	
	

}
}