package com.maveric.testproject;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class FirstTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		File file = new File("drivers/chromedriver_new.exe");
		String filePath = file.getAbsolutePath();
		System.out.println(filePath);
		
		
		System.setProperty("webdriver.chrome.driver", filePath);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriver driver =  new ChromeDriver(chromeOptions);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
	
		
		/*
		//Work with text box
		//Type a text
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("First");
		Thread.sleep(5000);
		//Clearing the text
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).clear();
		Thread.sleep(5000);
		
		//Click check box
		boolean cricketChckBoxFlag = driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
		
		if(!cricketChckBoxFlag) {
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			Thread.sleep(5000);
		}*/
		
		//Select dropdown
		boolean primaryObjectFlag ;
		if(driver.findElement(By.xpath("//h2[text()='Register']")).isDisplayed()) {
			primaryObjectFlag = true;
		}
		else {
			primaryObjectFlag = false;
		}
		
		if(primaryObjectFlag) {
			System.out.println("Expected registration page  found");
			Select drpSkills = new Select(driver.findElement(By.id("Skills")));
			
			drpSkills.selectByIndex(1);
			Thread.sleep(5000);
			drpSkills.selectByValue("Android");
			Thread.sleep(5000);
			drpSkills.selectByVisibleText("Android");
			
			
			//button click 
			driver.findElement(By.id("submitbtn")).click();
		}
		else {
			System.out.println("Expected registration page not found");
		}
		driver.quit();
		
	}
	
	public void sampleTests() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\ladmav-unified-test-automation-framework\\Drivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriver driver =  new ChromeDriver(chromeOptions);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.quit();
		
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public static int sub(int a,int b) {
		return a-b;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
