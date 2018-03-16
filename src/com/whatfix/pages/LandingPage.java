package com.whatfix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.whatfix.testclasses.SelfHelpTest;
import com.whatfix.utils.FunctionLib;
import com.whatfix.utils.Locators;

public class LandingPage {
	
	@FindBy(linkText=Locators.LandingPageLocators.selfHelpLoc)
	WebElement selfHelp;
	
	@FindBy(xpath=Locators.LandingPageLocators.helpPopUpLoc)
	WebElement helpPopup;
	
	@FindBy(linkText=Locators.LandingPageLocators.embedLoc)
	WebElement embed;
	
	@FindBy(xpath=Locators.LandingPageLocators.helpPopUp1Loc)
	WebElement helpPopup1;
	
	@FindBy(linkText=Locators.LandingPageLocators.slideShowLoc)
	WebElement slideshow;
	
	private final static String title ="How to import Google Analytics solution of whatfix? - whatfix";
	
	
	public LandingPage() {
		PageFactory.initElements(SelfHelpTest.getDriver(), this);
		Assert.assertEquals(SelfHelpTest.getDriver().getTitle(), title,"Failed as title was not matched.");
	}
	
	public SelfHelpPage gotoSelfHelpPage() {
		Assert.assertTrue(FunctionLib.isElemntVisble(selfHelp), "Failed as could not find element displayed or not");
		selfHelp.click();
		return new SelfHelpPage();
	}
	
	
	public SlideShowPage gotoSlideShow() {
		Assert.assertTrue(FunctionLib.isElemntVisble(helpPopup), "Failed as could not find element displayed or not for help");
		Assert.assertTrue(FunctionLib.isElemntVisble(embed), "Failed as could not find element displayed or not embed button");
		embed.click();
		Assert.assertTrue(FunctionLib.isElemntVisble(helpPopup1), "Failed as could not find element displayed or not for help 2nd part");
		slideshow.click();
		return new SlideShowPage();
	}
	
	
	
	
	
	
}
