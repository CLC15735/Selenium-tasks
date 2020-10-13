package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoRegister {
	
public static final String URL = "http://demo.guru99.com/test/newtours/";
	
	
	
	//Find the Create user section
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	private WebElement createUserLink;
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	private WebElement loginLink;
	
	// pages
	public Register register;
	
	//Constructor 
	public DemoRegister (WebDriver driver) {
		register = PageFactory.initElements(driver, Register.class);
	}
	
	//Methods
	public void navRegister() {
		createUserLink.click();
	}
	
	public void navLogin() {
		loginLink.click();
	}


}
