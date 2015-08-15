package com.loginTest.google;

import org.testng.annotations.Test;

import CommonDriverClass.DriverClass;

import com.loginpage.google.CommontMethodClass;

public class LoginTest {
	
	CommontMethodClass drc=new CommontMethodClass();
	DriverClass dc = new DriverClass();
	
	@Test
	public void TestLoginPg() throws InterruptedException 
	{	
		dc.openBrowser();
		//LoginPageElementsRepo lper=new LoginPageElementsRepo(WebDriver);
		Thread.sleep(5000);
		drc.getWebElements();
		Thread.sleep(5000);
//		lper.clickNextBtn();
//		Thread.sleep(5000);
//		Assert.assertEquals("imran.khan765@gmail.com", lper.verifyEmailId());
//		
		
	}

}
