package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utils.testbase;

public class homepage extends testbase

{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[.='GUYS']")
	WebElement watches;
	
	public homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public String verifytitle()
//	{
//		String hometitle1=driver.getTitle();
//		System.out.println(hometitle1);
//		return hometitle1;
//	}

	public void clickonwatches()
	{
		try
		{
		Actions action=new Actions(driver);
		action.moveToElement(watches).build().perform();
		watches.click();
		}
		catch(Exception e)
		{
			
		}
	}
	
	
}
