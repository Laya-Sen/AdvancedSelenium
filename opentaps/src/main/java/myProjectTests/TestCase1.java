package myProjectTests;

import org.testng.annotations.Test;

import com.maven.OpenTaps.base.WrapperMethods;

public class TestCase1 extends WrapperMethods{
	public void CreateLead() {
		
//		InvokeApp("chrome");
//		LaunchBrowser();
//		Type(LocateElement("id", "username"),"DemoSalesManager");
//		Type(LocateElement("id", "password"),"crmsfa");
//		Click(LocateElement("className", "decorativeSubmit"));
		Click(LocateElement("linkText", "CRM/SFA"));
		Click(LocateElement("linkText", "Create Lead"));
    	Type(LocateElement("id", "createLeadForm_companyName"),"Aadhav Airlines");
		Type(LocateElement("id", "createLeadForm_firstName"),"Aadhavan");
		Type(LocateElement("name", "lastNameLocal"),"Sen");
		Click(LocateElement("name","submitButton"));
	}
	
	

}
