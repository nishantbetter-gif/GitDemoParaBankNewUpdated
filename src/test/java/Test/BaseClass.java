package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver ;

	@BeforeTest
	public void BrowserOpen() {
		
		 driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
	}
	
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
	
}
