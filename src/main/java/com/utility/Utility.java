package com.utility;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Utility extends Config {
	
		
	public void launchingBrowser(String browser) {
		
		switch (browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			break;
		
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", geckoDriverPath);
			driver = new FirefoxDriver();
			break;
			
		case "HTMLUNIT":
			driver = new HtmlUnitDriver();
			break;
			
		default:
			System.out.println("Browser is not supported");
		}
		

	}

	public void browserMaximize() {
		driver.manage().window().maximize();
	}


	public void pageLoad() {
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	public void launchingApp(String url) {
		driver.get(url);
	}

	public void closingBrowser() {
		driver.quit();
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public void captureScreenshot() throws Exception {
		
		Date currentDate = new Date();
		String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File binaryFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Make sure screenshots folder is already created at the project level
		File imageFile = new File(screenshotsPath + screenshotFileName + ".png"); 
		FileUtils.copyFile(binaryFile, imageFile);
		
		
	}


}
