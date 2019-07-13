//package stepdefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//
//
//public class homepagesteps 
//{
//	WebDriver driver;
//	@Given("^Launch the browser$")
//	public void launch_the_browser() 
//	{
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		driver=new ChromeDriver();
//		
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//	@When("^Enter the URL$")
//	public void enter_the_URL() 
//	{
//	    driver.get("https://www.fastrack.in");
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//	    driver.manage().deleteAllCookies();
//	}
//
//	@Then("^check that home pgae is Title$")
//	public void check_that_home_pgae_is_Title() 
//	{
//	   String Etitle = driver.getTitle();
//	   System.out.println(Etitle);
//	   Assert.assertEquals(Etitle,"Shop Fashion Accessories For Men, Women & Kids - Fastrack");  
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser()
//	{
//		driver.close();
//	}
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
//	@Then("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_the_and(String Username, String password)
//	{
//	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
//	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//	}
//
//	@Then("^click on signin button$")
//	public void click_on_signin_button() 
//	{
//	    driver.findElement(By.xpath("//div[.='SIGN IN & CONTINUE']")).click();
//	}
//
//
//	
//	
//}
