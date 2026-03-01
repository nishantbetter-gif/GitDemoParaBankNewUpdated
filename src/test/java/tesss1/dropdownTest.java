package tesss1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dropdownTest {
	
	@Test
	public void DropDown() {
		
		// //div[@class='wM6W7d WggQGd']//span//b[normalize-space()='et automation testing jobs']
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("sdet");
		
		WebElement drop=driver.findElement(By.xpath("//div[@class='wM6W7d WggQGd']//span//b[normalize-space()='et jobs']"));
		drop.click();
		
		
	}

}
