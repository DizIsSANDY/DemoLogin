package stepdefination;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Guru99_DemoLoginPage;
import utility.Driver_class;

public class Guru99_DemoLogin extends Driver_class {
	WebDriver driver = 	Driver_class.setup();
	Guru99_DemoLoginPage DemoLoginOR;
	Properties prop = new Properties();
	FileInputStream File;
	String url;
	
	
	@Given("When User Launches Guru URL")
	public void when_user_launches_guru_url() throws InterruptedException, IOException {
		DemoLoginOR = new Guru99_DemoLoginPage(driver);
		File = new FileInputStream("src/test/java/utility/config.properties");
		prop.load(File);
		url = prop.getProperty("url");
		driver.get(url);
		Thread.sleep(3000);

//		try
//		{
//			File = new FileInputStream("src/test/java/utility/config.properties");
//			prop.load(File);
//			url = prop.getProperty(url);
//			driver.get(url);
//			Thread.sleep(3000);
//
//		}
//		catch(Exception e){
//			System.out.println("Config file not found");
//		}
		
		
 	}
	@When("Enter Username and Password")
	public void enter_username_and_password() throws IOException {
 			
		//DemoLoginOR.EnterUsername();
		//DemoLoginOR.EnterPassword();
		
		DemoLoginOR.EnterCredentials(prop.getProperty("username"), prop.getProperty("password"));
 	}
	@Then("Clicks on Submit Button")
	public void clicks_on_submit_button() {
		DemoLoginOR.LoginPageClickSubmit();
 	}
	
	
	

}
