package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;

public class LoginPage extends Utility{
	
	
	@FindBy(name="username")
	private WebElement userName;

	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginButton;
	
	@FindBy(xpath="//img[contains(@class, 'logo')]")
	private WebElement loginPageLogo;
	
	@FindBy(linkText="Log Out")
	private WebElement logoutLink;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean validateLoginPageLogo() {
		return loginPageLogo.isDisplayed();
	}
	
	public void loginUserName(String un) {
		userName.sendKeys(un);
	}	
	

	public void loginPassword(String pw) {
		passWord.sendKeys(pw);
	}	
	
	public HomePage loginButton() {
		loginButton.click();
		return new HomePage();
	}	
	
	//OR
	
	/*
	public HomePage login(String un, String pwd) {
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	*/
	
	public void logout() {
		logoutLink.click();
	}
}