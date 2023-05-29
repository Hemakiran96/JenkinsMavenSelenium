package com.base;

import org.testng.annotations.BeforeMethod;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OpenNewAccountPage;
import com.pages.RegistrationPage;
import com.utility.Config;
import com.utility.Utility;

import org.testng.annotations.AfterMethod;

public class BaseLoginLogout extends Utility {

	protected LoginPage lp;
	protected RegistrationPage rp;
	protected HomePage hp;
	protected OpenNewAccountPage onap;

	
	@BeforeMethod
	public void beforeMethod() {

		
		
		launchingBrowser("CHROME");

		launchingApp(url);

		lp = new LoginPage();
		rp = new RegistrationPage();
		hp = new HomePage();
		onap = new OpenNewAccountPage();
		
		lp.loginUserName(Config.username);
		lp.loginPassword(Config.password);
		hp = lp.loginButton();
		
	}
	@AfterMethod
	public void afterMethod() {

		lp.logout();
		
		closingBrowser();

	}

}
