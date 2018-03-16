package com.whatfix.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.whatfix.testclasses.SelfHelpTest;
import com.whatfix.utils.FunctionLib;
import com.whatfix.utils.Locators;

public class SlideShowPage {

	@FindBy(xpath=Locators.SlideShowPage.nextButtonLoc)
	WebElement nextButton;
	
	@FindBy(xpath=Locators.SlideShowPage.endFrameLoc)
	WebElement endFrame;
	
	@FindBy(tagName=Locators.SlideShowPage.closeButtonLoc)
	WebElement closebutton;
	
	
	public SlideShowPage() {
		/*not sure about page 
		so skipping validation part as of now*/	
		PageFactory.initElements(SelfHelpTest.getDriver(), this);
		}
	
	public void completeTask() {
		Assert.assertTrue(FunctionLib.isElemntVisble(nextButton), "Failed as could not find element displayed or not");
		nextButton.click();
		SelfHelpTest.getDriver().switchTo().frame(endFrame);
		Assert.assertTrue(FunctionLib.isElemntVisble(closebutton), "Failed as could not find element displayed or not");
		
		//This sleep is just to show close option is coming on screen. Not required can take it out. it will still run without sleep.
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		closebutton.sendKeys(Keys.RETURN);
	}
	
	
	
}
