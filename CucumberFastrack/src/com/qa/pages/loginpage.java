package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.testbase;

public class loginpage extends testbase
{
	@FindBy (xpath="//a[.='LOGIN' and  @id='loginPath']")
	WebElement Loginbtn;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//div[.='SIGN IN & CONTINUE']")
	WebElement signintn;
	
	@FindBy(xpath="//a[@class='close-icon']")
	WebElement closecookies;
	
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonloginbtn()
	{
		Loginbtn.click();
	}
	
   public String validatetitle()
   {
	   return driver.getTitle();
   }
   
   public void closecookies1()
   {
	   closecookies.click();
   }
   
   public void locationpopup()
   {
	   try
	   {
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	   }
	   catch(Exception e)
	   {
		   
	   }
   }
   public homepage loginpage(String un ,String pwd)
   {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   signintn.click();
	   
	   return new homepage();
   }
}
