package com.whatfix.testclasses;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.whatfix.pages.LandingPage;

		/*I wanted to do so many things but due to time constrain, I just added few things only.
		 * Few things I miss would be 
		 * 1. No Logger 
		 * 2. I wanted to keep setting firefox, chrome ,IE in base class with @beforeSuite.
		 * 3. Wanted to use FirefoxEventListner & itestresult to print output.
		 * 4a. Wanted to create report using ReportNG.
		 * 4b. If time was provided could have added in Maven and take advantage of surefire-plugin.
		 * 5. Wanted to use excel,YAML,CSV or properties files for locators
		 * 6. Wanted to create conif.proerties file and related immutable class for URL, TimeOut ScreenShots saving and all other details.
		 * Rohit P Kumar (9677231092)
		 */
public class SelfHelpTest {
	
	static {
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	private final static WebDriver driver;
	private final static String url= "https://whatfix.com/quickolabs.com/#!flows/how-to-import-google-analytics-solution-of-whatfix/8174f470-9df9-11e3-8178-386077c653fe/";
	
	
	public static void main(String args[])
	{
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		driver.get(url);
		LandingPage landingpg = new LandingPage();
		landingpg.gotoSelfHelpPage().clickBasedonSearch().gotoSlideShow().completeTask();
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
