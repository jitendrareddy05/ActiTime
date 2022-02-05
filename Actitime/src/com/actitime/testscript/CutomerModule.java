package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CutomerModule extends BaseClass{
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException  {
	FileLib f=new FileLib();
	String customerName = f.getExcelData("CreateCustomer", 1, 2);
	String custDescription = f.getExcelData("CreateCustomer", 1, 3);
	HomePage h=new HomePage(driver);
	h.clickTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getCustNameTbx().sendKeys(customerName);
	t.getCustDescpTbx().sendKeys(custDescription);
	t.getSelectCustDD().click();
	t.getOurCompanyOption().click();	
	t.getCreatCustBtn().click();
	Thread.sleep(4000);
	String actualCustomer = t.getActualCustCreatedTxt().getText();
	Assert.assertEquals(actualCustomer, customerName);
	
	
}
}
