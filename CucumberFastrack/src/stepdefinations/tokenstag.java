//package stepdefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class tokenstag 
//{
//	WebDriver driver;
//	
//	@Before
//	public void openapp()
//	{
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		driver=new ChromeDriver();
//	}
//	
//	@After
//	public void closeapp()
//	{
//		driver.close();
//	}
//	
//	@Before("@First")
//	public void firstsecnario()
//	{
//		System.out.println("First Scenario :pass");
//	}
//
//	@After("@First")
//	public void firstscenario1()
//	{
//		System.out.println("First Scenario :pass");
//	}
//	
//	@Before("@First")
//	public void secondsenario()
//	{
//		System.out.println("second Scenario :pass");
//	}
//
//	@After("@Second")
//	public void secondsenario1()
//	{
//		System.out.println("second Scenario :pass");
//	}
//	
//	@When("^enter URL$")
//	public void enter_URL()  
//	{
//		driver.get("https://www.fastrack.in");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@Then("^click login$")
//	public void click_login() 
//	{
//		 driver.findElement(By.xpath("//a[.='LOGIN' and  @id='loginPath']")).click();
//	}
//	
//	@When("^enter The URL$")
//	public void enter_URLs()  
//	{
//		driver.get("https://www.fastrack.in");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@Then("^click login link$")
//	public void click_logink() 
//	{
//		 driver.findElement(By.xpath("//a[.='LOGIN' and  @id='loginPath']")).click();
//	}
//	
//	
//
//
//}
