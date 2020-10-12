package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	//Empty constructor
	public Register() {
		
	}

	//Attributes
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[13]/td[2]/input")
		WebElement usernameField;
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")
	WebElement passwordField;
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	WebElement confirmPassword;
	
	@FindBy (xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")
	WebElement submit;
	
	
	//Method
	public void newUser(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		confirmPassword.sendKeys(password);
		submit.click();
		
	}
	
}
