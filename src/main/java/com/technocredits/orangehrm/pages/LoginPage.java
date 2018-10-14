package com.technocredits.orangehrm.pages;

import com.technocredits.orangehrm.base.PredefinedMethods;

public class LoginPage extends PredefinedMethods {
	
private static LoginPage loginPage = null;
	
	private LoginPage(){
		initializeBrowser();
	}
	
	public static LoginPage getInstance(){
		if(loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}
	public void enterValueForLoginPage(String locator, String value){
		setText(locator,value);
	}
	
	public void clickOnLoginPage(String locator){
		click(locator);
	}

}
