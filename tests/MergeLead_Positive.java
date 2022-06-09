package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class MergeLead_Positive extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName = "TestData004";
	}

	@Test(dataProvider = "getData")
	public void tc004(String username, String password,String fName) throws InterruptedException {
		
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadIcon()
		.enterFromLeadDetails(fName)
		.clickToLeadIcon()
		.enterToLeadDetails(fName);
	}
	
	
}
