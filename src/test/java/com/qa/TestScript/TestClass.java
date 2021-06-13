package com.qa.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void addressbook() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://18.118.14.237:49154/addressbook/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("Megha");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Rawat");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div"));	 
	}

}
