package org.ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\WindowsHandling\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rei.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//WebElement button1 = driver.findElement(By.xpath("//button[@id='search-button']"));
		//button1.click();
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}

	


