//package stepdefinations;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import java.lang.Iterable;
//
//public class logindata
//{
//	
//	WebDriver driver;
//	
//	@Given("^Launch the chrome browser$")
//	public void launch_the_chrome_browser() {
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		driver=new ChromeDriver();
//	}
//
//	@When("^Enter the home page URL$")
//	public void enter_the_home_page_URL()  {
//		 driver.get("https://www.fastrack.in");
//		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		    driver.manage().window().maximize();
//		    driver.manage().deleteAllCookies();
//	}
//
//	@Then("^click on login link$")
//	public void click_on_login_link() 
//	{
//	    driver.findElement(By.xpath("//a[.='LOGIN' and  @id='loginPath']")).click();
//	}
//
//	
//	@Then("^user enter the username and password$")
//	public void user_enter_the_username_and_password(DataTable deal) 
//	{
//		
//			for(Map<String,String>table:deal.asMaps(String.class, String.class))
//			{
//		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(table.get("username"));
//		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(table.get("password"));
//		 driver.findElement(By.xpath("//div[.='SIGN IN & CONTINUE']")).click();
//		 driver.findElement(By.xpath("//input[@id='username']")).clear();
//		 driver.findElement(By.xpath("//input[@id='password']")).clear();
//		 
//		}
//		
//	}
//
//	
//
//
//
//}
