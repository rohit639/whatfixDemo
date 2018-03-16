package com.whatfix.utils;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.whatfix.testclasses.SelfHelpTest;

public class FunctionLib {
	
	
	
	public static boolean isElemntVisble(WebElement webElement) {
		try {
		 WebDriverWait wait = new WebDriverWait(SelfHelpTest.getDriver(),180 );
		wait.until(ExpectedConditions.visibilityOf(webElement));
		return true;}
		catch (ElementNotVisibleException e) {
			System.out.println("Could not find visablity of element "+webElement+" "+e.getMessage());
			return false;
		}
	}
	
	

}
