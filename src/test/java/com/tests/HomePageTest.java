package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.base.BaseLoginLogout;


public class HomePageTest extends BaseLoginLogout {

	
	@Test()
	public void clickOpenNewAccLinkTest() throws Exception {
		
		onap = hp.clickOpenNewAccLink();
				
		String actualTitle = validatePageTitle();
		String expectedTitle = "ParaBank | Open Account";
		assertEquals(actualTitle, expectedTitle, "Open Account Page Title is not matched --> ");
		System.out.println(validatePageTitle());
		captureScreenshot();
	  
	}

}
