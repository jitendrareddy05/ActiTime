package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
@FindBy(xpath="//div[.='Add New']")
private WebElement addNewBtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newCustomerOption;

@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement custNameTbx;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement custDescpTbx;

@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement selectCustDD;

@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompanyOption;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement creatCustBtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualCustCreatedTxt;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustomerOption() {
	return newCustomerOption;
}

public WebElement getCustNameTbx() {
	return custNameTbx;
}

public WebElement getCustDescpTbx() {
	return custDescpTbx;
}

public WebElement getSelectCustDD() {
	return selectCustDD;
}

public WebElement getOurCompanyOption() {
	return ourCompanyOption;
}

public WebElement getCreatCustBtn() {
	return creatCustBtn;
}

public WebElement getActualCustCreatedTxt() {
	return actualCustCreatedTxt;
}


}








