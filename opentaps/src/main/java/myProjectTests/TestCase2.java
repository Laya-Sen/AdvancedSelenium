package myProjectTests;

import org.testng.annotations.Test;

import com.maven.OpenTaps.base.WrapperMethods;

public class TestCase2 extends WrapperMethods {
    @Test
	public void findLead(){
		
		Click(LocateElement("xpath","//a[contains(text(),'CRM/SFA')]"));
		Click(LocateElement("linkText","Leads"));
		Click(LocateElement("xpath","//a[contains(text(),'Find Leads')]"));
		Click(LocateElement("linkText","Phone"));
		Type(LocateElement("name","phoneNumber"),"7338708315");
		Click(LocateElement("linkText","Phone"));
		Click(LocateElement("xpath","//button[contains(text(),'Find Leads')]"));
		GetText(LocateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		Click(LocateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		Click(LocateElement("classname","subMenuButtonDangerous"));
	}
}