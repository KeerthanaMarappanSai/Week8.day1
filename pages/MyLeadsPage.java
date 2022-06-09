package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public MyLeadsPage() {

	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
	
	public MergeLeadPage clickMergeLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}
	 

}
