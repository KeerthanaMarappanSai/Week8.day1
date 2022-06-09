package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage() {

	}
	
	public ViewLeadPage verifyLeadId() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println(leadID);
		return this;
	}
	
	public EditLeadPage clickEditLeadButton(){
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
	}
	
	public DuplicateLeadPage clickDuplicateLeadButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
	}
	
	public MyLeadsPage clickDeleteLeadButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage();
	}
}
