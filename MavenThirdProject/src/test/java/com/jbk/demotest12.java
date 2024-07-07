package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demotest12 {
	
	@Test
	public void test01(){
		
    System.setProperty("chromedriver.chrome.driver", "chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		driver.close();
		
		
		
		
		
		
	}
	
	
	

}
