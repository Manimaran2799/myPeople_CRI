package com.testAcc;

import org.testng.annotations.Test;

import com.Base.testBase;

import pages_Haboom.account_Summary;
import pages_Haboom.login_Page;

public class testCases extends testBase{
	
	@Test
	public void Testcase_001() {
		
		new account_Summary().beforeLogin();//Checking whether mainexposure DD is not available before login
		
	}
	
	@Test
	public void TestCase_002() {
		new account_Summary().afterLogin("cmpunk02468@gmail.com", "Cmpunk@321");//checking whether mainExposure DD is available after Login
	}
	
	@Test
	public void TestCase_003() {
		new account_Summary().Fade("cmpunk02468@gmail.com", "Cmpunk@321");//elements get highlight after mouseHover
	}
	
	@Test
	public void TestCase_004() {
		new login_Page().Login("cmpunk02468@gmail.com", "Cmpunk@321");
		new account_Summary().clickMainExposure();
		new account_Summary().elementsVisibility();//elements visibility
		new account_Summary().accSummaryisDisplayed();//acc summary is displayed
	}
	
	@Test 
	public void TestCase_005() {
		new login_Page().Login("cmpunk02468@gmail.com", "Cmpunk@321");
		new account_Summary().showBalanceDisplayed();// function of hide balance button
	}
	
	@Test
	public void TestCase_006() {
		new login_Page().Login("cmpunk02468@gmail.com", "Cmpunk@321");
		new account_Summary().visibleofMainExposureDD();//function of Show balance button
	}
	
//	@Test
//	public void TestCase_007() {
//		new login_Page().Login("cmpunk02468@gmail.com", "Cmpunk@321");
//		new account_Summary().visiblityofShowBalanceBtn();
//	}
	
	@Test
	public void TestCase_008() {
		new login_Page().Login("cmpunk02468@gmail.com", "Cmpunk@321");
		new account_Summary().textOfUseronAccSumpage();//checking the welcome text on acc summary page
	}
	
	
}
