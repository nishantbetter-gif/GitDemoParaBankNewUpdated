package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	////input[@name='password']

	@FindBy(xpath="//input[@name='username']")
	WebElement UsernameInput;
	
	public void SetUsername(String name) {
		UsernameInput.sendKeys(name);
		
	}
	
	@FindBy(xpath="//input[@name='password']")
	WebElement PasswordInput;
	
	public void SetPassword(String password) {
		PasswordInput.sendKeys(password);
		
	}
	
	
	@FindBy(xpath="//input[@class='button']")
	WebElement button;
	
	public void ClickLogin() {
		button.click();
		
	}
	
}
