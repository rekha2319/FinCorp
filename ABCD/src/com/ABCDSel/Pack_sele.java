package com.ABCDSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pack_sele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome98\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		//to find element
		WebElement user=
		d.findElement(By.id("email"));
		user.sendKeys("rekha87in@yahoo.com");
		
		WebElement pass=
		d.findElement(By.name("pass"));
		pass.sendKeys("arunmytruelove");
		
		WebElement login=
		d.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(2000);
	}

	
}
