package com.whatfix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.whatfix.testclasses.SelfHelpTest;
import com.whatfix.utils.FunctionLib;
import com.whatfix.utils.Locators;

public class SelfHelpPage {
	
	@FindBy(xpath=Locators.SelfHelpPageLocators.srchElemLoc)
	WebElement serchElem;
	
	@FindBy(xpath=Locators.SelfHelpPageLocators.iFrameLoc)
	WebElement iFrame;
	
	@FindBy(linkText=Locators.SelfHelpPageLocators.embedWebSiteLoc)
	WebElement embedWebsiteApp;
	
	
	public SelfHelpPage() {
		PageFactory.initElements(SelfHelpTest.getDriver(), this);
		SelfHelpTest.getDriver().switchTo().frame(iFrame);
		Assert.assertTrue(FunctionLib.isElemntVisble(serchElem), "Failed as not able to find serach option in Self Help Page "+this.getClass());
	}

	public LandingPage clickBasedonSearch() {
		
		Assert.assertTrue(FunctionLib.isElemntVisble(embedWebsiteApp), "Failed as not able to click on \"How to embed flows in my website or application?\"");
		embedWebsiteApp.click();
		SelfHelpTest.getDriver().switchTo().parentFrame();
		return new LandingPage();
	}	
	
}
