package com.whatfix.utils;

public class Locators {

	public class LandingPageLocators{
		public final static String selfHelpLoc ="Self Help";
		public final static String helpPopUpLoc = "//div[contains(text(),\"Click on 'embed' options.\")]";
		public final static String embedLoc ="embed";
		public final static String helpPopUp1Loc = "//div[@id='wfx-tooltip-title' and contains(text(),\"Select your favorite embed option.\")]";
		public final static String slideShowLoc = "slideshow";
	}
	
	public class SelfHelpPageLocators{
		public final static String srchElemLoc = "//input[@title='search']";
		public final static String iFrameLoc = "//div[@id='_widget_launcher_wfx_']/iframe";
		public final static String embedWebSiteLoc = "How to embed flows in my website or application?";
	}
	
	public class SlideShowPage{
		public final static String nextButtonLoc ="//div[@id='wfx-tooltip-title' and contains(text(),\"Copy\")]/following::tr//a[@id='wfx-tooltip-next']";
		public final static String endFrameLoc = "//div[@id='wfx-player-endPopup']//iframe";
		public final static String closeButtonLoc = "button";
	}
}
