package smarttech.ny.elementspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.ny.basepage.ParentClass;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends ParentClass {
	
	//Initialization Page factory
	public MasterPageFactory(){
		 PageFactory.initElements(driver, this);
	 }
	
	
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	@CacheLookup
	private WebElement enterEmail;
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	@FindBy(xpath = "(//input[@type='password'])[1]")
	@CacheLookup
	private WebElement enterPassword;
	public WebElement getEnterPassword() {
		return enterPassword;
	}
 @FindBy(xpath = "(//button[@type='submit'])[1]")
 @CacheLookup
 private WebElement ClickOnLoginBTN;
 public WebElement getClickOnLoginBTN() {
	return ClickOnLoginBTN;
}


 @FindBy(xpath = "//*[text()=' Home']")
 @CacheLookup
 private WebElement VerifyHomepage;
 
 public WebElement getVerifyHomepage() {
	return VerifyHomepage;
}
 @FindBy(xpath = "//*[text()=' Products']")
 @CacheLookup
 private WebElement ClickOnProducts;
 
 public WebElement getClickOnProducts() {
	return  ClickOnProducts;
}
 
 
public void getLogin(String userName,String pwd) {
	 getEnterEmail().sendKeys(userName);
	 getEnterPassword().sendKeys(pwd);
	CommonUtil.actionClick(getClickOnLoginBTN());
}

}


