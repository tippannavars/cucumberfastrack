package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public testbase()
	{
		//
	//	************************
		//
		prop=new Properties();
		try
		{
			FileInputStream fis= new FileInputStream("F:\\Cucumberframework\\CucumberFastrack\\src\\com\\qa\\config\\config.properties ");
				prop.load(fis);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
				
	}


public static void initialization()
{
	String browername = prop.getProperty("browser");
	if(browername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(testutil.ITO, TimeUnit.SECONDS);
}

public static void closethebrowser()
{
	driver.close();
}
}
