package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage() {
		
	}

	public EditLeadPage editCompName(String cName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
