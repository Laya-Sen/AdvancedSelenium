package com.maven.OpenTaps.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WrapperMethods extends WdEventListener{
	
	WebDriver driver;
	public static EventFiringWebDriver eventDriver;

	public WebElement LocateElement(String how, String using)
	{
		WebElement ele = null;
		switch(how) {
		
		case("id"):			
			ele =eventDriver.findElement(By.id(using)); break;
			
		case("name"):			
			ele =eventDriver.findElement(By.name(using));break;
						
			case("className"):
				ele =eventDriver.findElement(By.className(using));break;
			
			case("linkText"):
				ele =eventDriver.findElement(By.linkText(using));break;
			
			case("xpath"):
				ele =eventDriver.findElement(By.xpath(using));break;
				
			case("partiallinktext"):
				ele =eventDriver.findElement(By.partialLinkText(using));break;
				
			case("css"):
				ele =eventDriver.findElement(By.cssSelector(using));break;
				
		case("default"):
		System.out.println("The given locator"+how+"is not correct");
	}
		return ele;
	}
	public void Type(WebElement ele, String value)
	
	{
	ele.sendKeys(value);
	}
	
	public void Click(WebElement ele)
	
	{
		ele.click();
	}
	
	public void SelectByVisbleText(String locator, String text)
	{
		
	}
	
	public void SelectByIndex(String locator)
	
	{
		
	}
	
	public WebElement SelectByValue(String locator, String value)
	
	{
		return null;
	}
	
   public void LaunchBrowser(){
	   
	   eventDriver.navigate().to("http://leaftaps.com/opentaps/control/main");
	}
	public void AlertAccept()
	{
		eventDriver.switchTo().alert().accept();
				
	}
	
	public void AlertDismiss()
	{
		eventDriver.switchTo().alert().dismiss();
	}
    
	public WebElement AlertText(String locator)
	
	{
		return null;
		
	}
	
	public void SwitchToFrame()
	{
		
	}
	
	public boolean VerifyTitle(WebElement ele, String value)
	{
		return false;
	}
	

	public void SwitchWindow(int index){
		Set<String> allWindowHandles = eventDriver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		eventDriver.switchTo().window(allWindows.get(index));
		
	}
	
	public String GetAttribute(WebElement ele, String value)
	{
		return null;
	}
	
	public String GetText(WebElement ele)
	
	{
		return ele.getText();
	}
	
    public boolean VerifyText(WebElement ele, String value)
	
	{
		String text = GetText(ele);
		if(text.equals(value)){
			return true;
			}
		else 
		{
			return false;
		}
	}
	
	public void TakeSnap() {
		
}
	
	public void InvokeApp(String browser) {
		
		if (browser.equals("firefox")){
				
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
							
		}
		else if (browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
	   else if (browser.equals("IE")){
			
			System.setProperty("webdriver.IE.driver", "./drivers/IE.exe");
			
		}
		
		eventDriver = new EventFiringWebDriver(driver);
		WdEventListener handler = new WdEventListener();
		eventDriver.register(handler);
		eventDriver.get("http://leaftaps.com/opentaps");
		
	}
	
	public void QuitApp() {
		driver.quit();
	}
}
