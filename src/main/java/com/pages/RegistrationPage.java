package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;

public class RegistrationPage extends Utility{
	
	//Find By locators
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	//OR
	
	/*
	@FindBy(how = How.LINK_TEXT, using = "Register")
	private WebElement registerLink;
	*/
	
	
	@FindBy(id="customer.firstName")
	private WebElement firstName;
	
	@FindBy(id="customer.lastName")
	private WebElement lastName;
	
	@FindBy(id="customer.address.street")
	private WebElement address;
	
	@FindBy(id="customer.address.city")
	private WebElement city;
	
	@FindBy(id="customer.address.state")
	private WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	private WebElement zipCode;
	
	@FindBy(id="customer.phoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(id="customer.ssn")
	private WebElement ssNumber;
	
	@FindBy(id="customer.username")
	private WebElement userName;
	
	@FindBy(id="customer.password")
	private WebElement password;
	
	@FindBy(id="repeatedPassword")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement registerButton;
	
	
	// Constructor of the page class
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// Page actions
	public void registrationLink() {
		registerLink.click();
	}
	
	public void firstName() {
		firstName.sendKeys("John");
		}	
	
	public void lastName() {
		lastName.sendKeys("Cena");
		}	
	
	public void address() {
		address.sendKeys("myadd");
		}	
	
	public void city() {
		city.sendKeys("mycity");
		}	
	
	public void state() {
		state.sendKeys("mystate");
		}	
	
	public void zipCode() {
		zipCode.sendKeys("123456");
		}	
	

	public void phone() {
		phoneNumber.sendKeys("9999999999");
			}	
	

	public void ssn() {
		ssNumber.sendKeys("123");
		}	
	

	public void userName() {
		userName.sendKeys("user1003");
		}	
	

	public void password() {
		password.sendKeys("pass1001");
		}	
	

	public void confirmPassword() {
		confirmPassword.sendKeys("pass1001");
		}	
	

	public HomePage registrationButton() {
		registerButton.click();
		return new HomePage();
	}
}
