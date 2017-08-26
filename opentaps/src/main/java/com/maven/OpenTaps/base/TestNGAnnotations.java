package com.maven.OpenTaps.base;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;

public class TestNGAnnotations extends wdWrappers {
@BeforeSuite
 public void BeforeSuiteTest() {
	System.out.println("This is Before Suite");
}
 @BeforeTest
 public void BeforeTest() {
 		System.out.println("This is Before Test");
 	}
@BeforeGroups
public void BeforeGroup() {
	System.out.println("This is Before Group");
}
@BeforeClass
public void BeforeClass() {
System.out.println("This is BeforeClass");
}

@DataProvider 
public void DataProvider() {

}

@BeforeMethod
public void BeforeMethod() { 
	InvokeApp("chrome");
	LaunchBrowser();
	Type(LocateElement("id", "username"),"DemoSalesManager");
	Type(LocateElement("id", "password"),"crmsfa");
	Click(LocateElement("className", "decorativeSubmit"));
System.out.println("This is BeforeMethod");
}

/*@Test
public void TestCase1() {
	System.out.println("I am a test case");
}*/


@AfterTest
public void AfterTest() {
		System.out.println("This is After Test");
	}

@AfterMethod
public void AfterMethod() {
	driver.quit();
System.out.println("This is After Method");
}

@AfterClass
public void AfterClass() {
System.out.println("This is After Class");
}
@AfterGroups
public void AfterGroup() {
	System.out.println("This is After Group");
}

@AfterSuite
public void AfterSuiteTest() {
	System.out.println("This is After Suite");
}


}
