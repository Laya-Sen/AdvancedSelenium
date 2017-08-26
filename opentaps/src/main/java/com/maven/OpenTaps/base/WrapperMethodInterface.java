package com.maven.OpenTaps.base;

import org.openqa.selenium.WebElement;

public interface WrapperMethodInterface {
		
		public WebElement LocateElement(String how, String using);
		public void Type(WebElement ele, String value);
		public void Click(WebElement ele);
		public void SelectByVisbleText(String locator, String text);
		public void SelectByIndex(String locator);
		public WebElement SelectByValue(String locator, String value);
	    public void LaunchBrowser();
		public void AlertAccept();		
		public void AlertDismiss();
		public WebElement AlertText(String locator);
		public void SwitchToFrame();
		public boolean VerifyTitle(WebElement ele, String value);
		public void SwitchWindow(int index);
		public String GetAttribute(WebElement ele, String value);
		public String GetText(WebElement ele);		
		public boolean VerifyText(WebElement ele, String value);
		public void TakeSnap();
		public void InvokeApp(String browser);
		public void QuitApp();
		public void closeAllBrowsers();
		public String getAlertText();
		
	}
