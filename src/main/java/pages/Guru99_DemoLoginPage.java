package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99_DemoLoginPage {
	
	public WebDriverWait wait;
	WebDriver driver;
	
	 
	
	@FindBy(xpath="//input[@name='email']")
	@CacheLookup
	WebElement LoginPageUsername;
	
	@FindBy(xpath="//input[@name='passwd']")
	@CacheLookup
	WebElement LoginPagePassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	@CacheLookup
	WebElement LoginPageSubmit;
	
	@FindBy(css="#SubmitLogin")
	@CacheLookup
	WebElement LoginPageCSSSubmit;
	
	public Guru99_DemoLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30))	;
	}
	
	public void EnterCredentials(String username, String password)
	
	{

		LoginPageUsername.sendKeys(username);
		LoginPagePassword.sendKeys(password);
	}

	/*public void EnterUsername()
	{
		LoginPageUsername.clear();
		LoginPageUsername.sendKeys("sandeep@test.com");
			}
	
	public void EnterPassword()
	{
		LoginPagePassword.clear();
		LoginPagePassword.sendKeys("sandeep");
			} */
	
	
	public void LoginPageClickSubmit()
	{
		List<String> ButtonList = new ArrayList<String>();
		String LoginSubmit = LoginPageSubmit.getText();
		ButtonList.add(LoginSubmit);	
if(ButtonList.contains("Submit"))
{
	LoginPageSubmit.click();

}
	}
}
