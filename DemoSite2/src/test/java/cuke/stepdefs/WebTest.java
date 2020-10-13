package cuke.stepdefs;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebTest {
	
	public static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e13cr\\Documents\\Training\\Selenium\\DemoSite2\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    WebElement assist;
	    driver.get("http://thedemosite.co.uk/");
	    
	    assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/center/big/strong"));
	    assertEquals("1. Home", assist.getText());
	    
	}

	@When("^I navigate to the 'Add a User' page$")
	public void i_navigate_to_the_Add_a_User_page() throws Throwable {
		WebElement assist;
		
		assist = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
	    assist.click();
	    
	    assertEquals("3. Add a User", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/p[1]/big/strong")).getText());
		
	}


	@Then("^I can generate a new user using the following$")
	public void i_can_generate_a_new_user_using_the_following(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		WebElement assist;
		
		List<List<String>> listData = arg1.raw();
		List<String> userInfo = listData.get(1);
		
		assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		assist.sendKeys(userInfo.get(0));
		
		assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		assist.sendKeys(userInfo.get(1));
		
		assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		assist.click();
		
	}
	
	@Then("^I can login using the new credentials$")
	public void i_can_login_using_the_new_credentials(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		WebElement assist;
		
		assist = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		assist.click();
		
		assertEquals("4. Login", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/p[1]/big/strong")).getText());
	    
		List<List<String>> listData = arg1.raw();
		List<String> userInfo = listData.get(1);
		
		assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		assist.sendKeys(userInfo.get(0));
		
		assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		assist.sendKeys(userInfo.get(1));
		
		assist = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		assist.click();
		
		assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
		
	}

	
	@After
	public void cleanup() {
		driver.close();
		driver.quit();
	}

}
