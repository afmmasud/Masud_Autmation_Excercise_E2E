package smarttech.ny.TestNgChallenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting { 
	
	WebDriver driver;
	
	@BeforeMethod 
	@Parameters("Browser") //Parameters one of the advance annotation which we use to run cross browser testing
	public void initialization(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")){
			System.out.println("Test will excute with chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.out.println("Test will excute with Edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test will excute with Firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		}

	@AfterMethod // Before it was cucumber,But now it is  Coming from TestNg
     public void getcloseBrowser() {
	 driver.quit(); 
	 System.out.println("Browser closed");
 }
	@Test //Same test cases will run in multiple browser
     public void getLogIn() {
	 driver.get("https://www.automationexercise.com/login");
	 driver.manage().window().maximize();
	 System.out.println("Log in the Application  ");
}
}
