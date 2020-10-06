package selenium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHighLow {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\e13cr\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\selenium-day1\\src\\test\\resources\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Test
	public void test() throws InterruptedException {
        WebElement assistElement;
        List<WebElement> high = new ArrayList<WebElement>();
        List<String> store = new ArrayList<String>();
		
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
        Thread.sleep(1500);
        
        //Find the higher    
        assistElement = driver.findElement(By.linkText("RISERS"));
        assistElement.click();
        Thread.sleep(2500);
        
        high = driver.findElements(By.partialLinkText("%"));
        
        int count = 0;
        for (WebElement higher : high) {
        	store.add(higher.getText());
        	count++;
        }
        
        Thread.sleep(20000);
        //assertEquals("Bing", driver.getTitle());
    }
	
	@After
	public void tearDown() {
        driver.close();
    }

}