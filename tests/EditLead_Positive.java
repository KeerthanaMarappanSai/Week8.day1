package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class EditLead_Positive extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName = "TestData002";
	}

	@Test(dataProvider = "getData")
	public void tc002(String username, String password, String phNum, String cName ) throws InterruptedException {
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
		.clickEditLeadButton()
		.editCompName(cName)
		.clickUpdateButton()
		.verifyLeadId();
		
	}
}
