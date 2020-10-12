package com.qa.cuke.stepdef;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTest {
	
	public static WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e13cr\\Documents\\Training\\Selenium\\Kittens\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
		
		
	}
	
	@Given("^We can open google$")
	public void we_can_open_google() throws Throwable {
		driver.get("https://www.google.com");
	    String titlePage = driver.getTitle();
	    assertEquals("Google", titlePage);
	    Thread.sleep(1000);
	}

	@When("^we search for kittens$")
	public void we_search_for_kittens() throws Throwable {
	    WebElement assist;
	    String lookUp = "kittens";
	    assist =  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
	    assist.sendKeys(lookUp);
	    
	    assertEquals(lookUp, assist.getAttribute("value"));
	    assist.submit();
	    Thread.sleep(1000);

	}

	@Then("^google will return us images of kittens$")
	public void google_will_return_us_images_of_kittens() throws Throwable {
		WebElement assist;
		assist =  driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
	    assist.click();
	   
	}
	
	@After
	public void cleanup() {
		
		driver.close();
		driver.quit();
		
	}
	
	public static ChromeOptions chromeCfg() {
		Map<String, Object> prefs = new HashMap<String, Object>();
		ChromeOptions cOptions = new ChromeOptions();
		
		prefs.put("profile.default_content_setting_values.cookies", 2);
		prefs.put("nework.cookie.cookieBehavior", 2);
		prefs.put("profile.block_third_party_cookies", true);
		
		cOptions.setExperimentalOption("prefs", prefs);
		
		return cOptions;
	}

}
