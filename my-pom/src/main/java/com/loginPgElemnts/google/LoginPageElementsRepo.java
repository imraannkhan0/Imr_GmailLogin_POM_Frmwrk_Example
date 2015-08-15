package com.loginPgElemnts.google;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonDriverClass.DriverClass;

import com.loginpage.google.CommontMethodClass;


public class LoginPageElementsRepo {

	CommontMethodClass cmc=new CommontMethodClass();
	WebDriver driver = DriverClass.getDriver();
	@FindBy(id="Email")
	private WebElement enterEmailIdTxtBx;
	
	@FindBy(id="next")
	public WebElement clickNextBtn;
	
	@FindBy(id="email-display")
	public WebElement verifyEmail;
	
	public WebElement getEmailEditBox(){
		return enterEmailIdTxtBx;
	}
		
	public void enterEmailid(String enterEmail) throws InterruptedException 
	{
		getEmailEditBox().sendKeys(enterEmail);
	}

	public void clickNextBtn()
	{
		clickNextBtn.click();
	}
	
	public String verifyEmailId(){
		return verifyEmail.getText();
	}
	
	public void waitForSomeTime(){
		
	}
	
}
