package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomePage extends Utility {
	
	@FindBy(linkText="Open New Account")
	private WebElement openNewAccLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public OpenNewAccountPage clickOpenNewAccLink() {
		openNewAccLink.click();
		return new OpenNewAccountPage();
	}

}
