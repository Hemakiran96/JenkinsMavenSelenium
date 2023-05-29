package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.Base;


public class RegistrationPageTest extends Base{
	

	@Test()
	public void verifyRegistrationTest() throws Exception {
		
		rp.registrationLink();
		rp.firstName();
		rp.lastName();
		rp.address();
		rp.city();
		rp.state();
		rp.zipCode();
		rp.phone();
		rp.ssn();
		rp.userName();
		rp.password();
		rp.confirmPassword();
		hp = rp.registrationButton();
		Thread.sleep(2000);
		
		
		String actualTitle = validatePageTitle();
		String expectedTitle = "ParaBank | Customer Created";
		assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		Thread.sleep(1000);
		
		captureScreenshot();
		
		
	}




}
