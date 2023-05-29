package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void test01() throws InterruptedException {
			// TODO Auto-generated method stub
			
			//1.Launch the chrome browser
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\HEYANDRA\\eclipse-workspace\\SeleniumExample\\drivers\\chromedriver.exe" );
			
			//Way2
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
			//System.out.println(projectPath);
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
			
			
			//2. launch para bank
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			Thread.sleep(2000);
			
			//3.Verify the page title
			String expectedResult = "ParaBank | Welcome | Online Banking";
		    String actualResult = driver.getTitle();
		    //System.out.println("Test  Actual Result" + actualResult);
		    
		    if(expectedResult.equals(actualResult)) {
		    	System.out.println("Test is passed");
		    }
		    else {
		    	System.out.println("Test is failed");
		    }
			Thread.sleep(2000);
		    //4. Close the chrome browser
		    driver.close();//Close on browser window
		    //driver.quit(); close the one browse

}
}