package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class DuplicateLead_Positive extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName = "TestData003";
	}

	@Test(dataProvider = "getData")
	public void tc003(String username, String password, String phNum) throws InterruptedException {
		new LoginPage()
		.typeUsername(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.clickPhoneNum()
		.typePhoneNum(phNum)
		.clickFindLeadsButton()
		.selectFirstLead()
		.clickDuplicateLeadButton()
		.clickSubmitButton()
		.verifyLeadId();
	}
}
