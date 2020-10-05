package selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_LogIn {
private WebDriver driver;
	
	@Before
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\e13cr\\Documents\\Training\\Selenium\\TheDemoSite\\src\\test\\resources\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Test
	public void test() throws InterruptedException {
		WebElement openPage;
		WebElement newUser;
		WebElement newPassword;
		WebElement saveDetails;
		WebElement successfulLogin;
		
		String user = "Cris";
		String password = "Something";
		
		//Load the page
		driver.get("http://thedemosite.co.uk/");
        
        
        //Go into create new user
        openPage = driver.findElement(By.linkText("3. Add a User"));
        openPage.click();
        Thread.sleep(1000);
        
        //Find and add the user
        newUser = driver.findElement(By.name("username"));
        newUser.sendKeys(user);
        Thread.sleep(1000);
        
        //Find and add the password
        newPassword = driver.findElement(By.name("password"));
        newPassword.sendKeys(password);
        Thread.sleep(1000);
        
        //Hit save button
        saveDetails = driver.findElement(By.name("FormsButton2"));
        saveDetails.click();
        Thread.sleep(1000);
        
        //Login page
        openPage = driver.findElement(By.linkText("4. Login"));
        openPage.click();
        
        //Find and add the user
        newUser = driver.findElement(By.name("username"));
        newUser.sendKeys(user);
        Thread.sleep(1000);
        
        //Find and add the password
        newPassword = driver.findElement(By.name("password"));
        newPassword.sendKeys(password);
        Thread.sleep(1000);
        
        //Hit save button
        saveDetails = driver.findElement(By.name("FormsButton2"));
        saveDetails.click();
        Thread.sleep(1000);
        
        //
        successfulLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
            
        
        assertEquals("**Successful Login**", successfulLogin.getText());
    }
	
	@After
	public void tearDown() {
        driver.close();
    }

}
