package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement passward;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement button;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NagiateToPage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void enterCred(String name,String pass) {
		username.sendKeys(name);
		passward.sendKeys(pass);
	}
	
	public void submit() {
		button.click();
	}

}
