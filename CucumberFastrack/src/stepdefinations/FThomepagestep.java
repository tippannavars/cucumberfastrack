package stepdefinations;

import com.qa.pages.homepage;
import com.qa.pages.loginpage;
import com.qa.utils.testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FThomepagestep extends testbase
{
	loginpage login;
	homepage home;
	
	@Given("^launch the browser$")
	public void launch_the_browser() 
	{
	    testbase.initialization();
	    loginpage login=new loginpage();
	    login.closecookies1();
	    login.locationpopup();
	    
	}

	@When("^user is on login page$")
	public void user_is_on_login_page() 
	{
	loginpage login=new loginpage();
	String	atitle=login.validatetitle();
	Assert.assertEquals("Shop Fashion Accessories For Men, Women & Kids - Fastrack",atitle);
	
	login.clickonloginbtn();
	}

	@Then("^enter the credentials and click on signin button$")
	public void enter_the_credentials_and_click_on_signin_button() 
	{
	   loginpage login=new loginpage();
	   home= login.loginpage(prop.getProperty("username"), prop.getProperty("password"));
	}

//	@Then("^on homepage check the title$")
//	public void on_homepage_check_the_title() 
//	{
//	 homepage home=new homepage();
//	  String hometitle=home.verifytitle();
//	  System.out.println(hometitle);
//	  Assert.assertEquals("Shop Fashion Accessories For Men, Women & Kids - Fastrack",hometitle);
//	}

	@Then("^click on watches category$")
	public void click_on_watches_category() 
	{
		try
		{
		homepage home=new homepage();
	    home.clickonwatches();
		}
		catch(Exception e)
		{
			
		}
	}
	
	@Then("^close the browser$")
	public void close_the_browser() 
	{
	   testbase.closethebrowser();
	}
	
	

}
