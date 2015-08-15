package com.loginpage.google;

import org.openqa.selenium.support.PageFactory;

import com.loginPgElemnts.google.LoginPageElementsRepo;

import CommonDriverClass.DriverClass;

public class CommontMethodClass {
	
	public void getWebElements() throws InterruptedException{
		LoginPageElementsRepo pm = new LoginPageElementsRepo();
		pm = PageFactory.initElements(DriverClass.getDriver(), LoginPageElementsRepo.class);
		
		pm.enterEmailid("test");
	}
	

}
