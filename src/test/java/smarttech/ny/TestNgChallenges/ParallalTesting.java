package smarttech.ny.TestNgChallenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallalTesting {
	WebDriver driver;
  	   @Test
   public void smokeTest() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		 driver.manage().window().maximize();
		 System.out.println("smokeTest");
	}
   @Test
      public void seantyTesten(){
    	  WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
	   driver.get("https://magento.softwaretestingboard.com/");
	   driver.manage().window().maximize();
	 System.out.println("seantyTesten");
	   
   }
   @Test
     public void regressionTest() {
    	 WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
	  driver.get("https://magento.softwaretestingboard.com/");
	  driver.manage().window().maximize();
	 System.out.println("regressionTest");
	   
}
   @Test
     public void funtionalTest() {
    	 WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
	 driver.get("https://magento.softwaretestingboard.com/");
	 driver.manage().window().maximize();
	 System.out.println(" funtionalTest");
	   
}
}
