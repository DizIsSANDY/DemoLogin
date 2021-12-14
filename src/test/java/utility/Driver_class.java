package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_class {

 		// TODO Auto-generated method stub
		
		public static WebDriver driver;
		
		public static WebDriver setup()
		{	
		
			if( driver == null)
			{
				System.setProperty("webdriver.chrome.driver" ,"C:\\Eclipse\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}
			return driver;	
		}
		
	}


