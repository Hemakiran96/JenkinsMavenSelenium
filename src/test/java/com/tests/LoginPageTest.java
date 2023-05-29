package com.tests;

import org.testng.annotations.Test;

import com.base.Base;
import com.utility.Config;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



public class LoginPageTest extends Base{
	

	@Test(priority = 1)
	public void verifyLoginPageTitleTest(){
		
	
		String actualTitle = validatePageTitle();
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		
		
	}

	@Test(priority = 2)
	public void verifyLoginPageLogoTest() {
		
		
		boolean flag = lp.validateLoginPageLogo();
		assertTrue(flag);
		System.out.println(flag);
		
	}

	@Test(priority = 3)
	public void verifyLoginTest() throws Exception {
		
		lp.loginUserName(Config.username);
		lp.loginPassword(Config.password);
		hp = lp.loginButton();
		
		//OR
		
		//hp = lp.login(Config.username, Config.password);
		
		String actualTitleLogin = validatePageTitle();
		String expectedTitleLogin = "ParaBank | Accounts Overview";
		assertEquals(actualTitleLogin, expectedTitleLogin);
		System.out.println(validatePageTitle());
		captureScreenshot();
		
		lp.logout();
		
		String actualTitleLogout = validatePageTitle();
		String expectedTitleLogout = "ParaBank | Welcome | Online Banking";
		assertEquals(actualTitleLogout, expectedTitleLogout);
		System.out.println(validatePageTitle());
	  
		
	
	}



}
