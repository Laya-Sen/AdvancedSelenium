package myProjectTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.maven.OpenTaps.base.WrapperMethods;

public class TestCase3 extends WrapperMethods{
	@Test
	public void deleteLead(){
		
		Type(LocateElement("id", "username"), "DemoSalesManager");
		Type(LocateElement("id", "password"), "crmsfa");
		
		Click(LocateElement("type", "submit"));
		Click(LocateElement("linkText", "CRM/SFA"));
		Click(LocateElement("linkText", "Leads"));
		Click(LocateElement("linkText", "Find Leads"));
		Click(LocateElement("linkText", "Phone"));
		Click(LocateElement("name", "phoneCountryCode"));
		Type(LocateElement("name", "phoneNumber"), "9790888529");
		Click(LocateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String firstLead = getText(LocateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		System.out.println("First Lead in search :: " +firstLead);
		Click(LocateElement("xpath", "(//a[@class = 'linktext'])[4]"));
		Click(LocateElement("linkText", "Delete"));
		Click(LocateElement("linkText", "Find Leads"));
		Type(LocateElement("name", "id"), firstLead);
		Click(LocateElement("xpath", "//button[text()='Find Leads']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String errorMsg = getText(LocateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Error Message :: "+errorMsg);
		String verifyNoLeadMsg = getText(LocateElement("xpath", "//div[@class='x-paging-info']"));
		System.out.println("Verify Deleted Leads not present in list "+verifyNoLeadMsg);
		//closeBrowser();
		
		
		
		
		
	}

	private String getText(WebElement locateElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
