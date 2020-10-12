package cuke.stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebpageTest {
	
	public static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e13cr\\Documents\\Training\\Selenium\\PassionateTea\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
		
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    WebElement assist;
		driver.get("http://www.practiceselenium.com/welcome.html");
	    
		assist = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914886\"]/div/h1"));
	    assertEquals("We're passionate about tea. ", assist.getText());
	    
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
		WebElement assist;
		
		assist = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
	    assist.click();
	    
	    assertEquals("Menu", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")).getText());
		
	}

	@Then("^I can browse a list of available items$")
	public void i_can_browse_a_list_of_available_items() throws Throwable {
	    
		assertEquals("Green Tea", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")).getText());
		assertEquals("Red Tea", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")).getText());
		assertEquals("Oolong Tea", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")).getText());
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
		WebElement assist;
		
		assist = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a"));
	  
	    assertEquals("Check Out", assist.getText());
		
	    assist.click();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
		assertEquals("Pay with Credit Card or Log In", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong")).getText());
	}
	
	@After
	public void cleanup() {
		driver.close();
		driver.quit();
	}

}
